package be.technifutur.gestionstock.services;

import be.technifutur.gestionstock.model.dto.ProductDTO;
import be.technifutur.gestionstock.model.form.ProductForm;

import java.util.List;

public interface ProductService {

    void createProduct(ProductForm productForm);

    ProductDTO getProduct(Long id);

    List<ProductDTO> getAllProducts();

    void deleteProduct(Long id);

    ProductDTO updateProduct(Long id, ProductForm form);

}

