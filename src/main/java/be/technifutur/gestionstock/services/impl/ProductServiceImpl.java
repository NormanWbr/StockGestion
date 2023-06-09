package be.technifutur.gestionstock.services.impl;

import be.technifutur.gestionstock.model.dto.ProductDTO;
import be.technifutur.gestionstock.model.entity.Product;
import be.technifutur.gestionstock.model.form.ProductForm;
import be.technifutur.gestionstock.repository.ProductRepository;
import be.technifutur.gestionstock.services.ProductService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ProductDTO createProduct(ProductForm productForm) {
        Product product = productForm.toEntity();
        productRepository.save(product);
        return ProductDTO.toDTO(product);
    }

    @Override
    public ProductDTO getProduct(Long id) {
        return productRepository.findById(id)
                .map(ProductDTO::toDTO)
                .orElseThrow();
    }

    @Override
    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream().map(ProductDTO::toDTO).toList();
    }

    @Override
    public ProductDTO deleteProduct(Long id) {
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        productRepository.delete(product);
        return ProductDTO.toDTO(product);
    }

    @Override
    public ProductDTO updateProduct(Long id, ProductForm form) {
        Product product = productRepository.findById(id).orElseThrow(EntityNotFoundException::new);
        product.setName(form.getName());
        product.setQuantity(form.getQuantity());
        product.setPrice(form.getPrice());
        productRepository.save(product);
        return ProductDTO.toDTO(product);
    }

}
