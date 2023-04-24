package be.technifutur.gestionstock.services;

import be.technifutur.gestionstock.model.dto.ProductDTO;
import be.technifutur.gestionstock.model.form.ProductForm;

import java.util.List;

public interface ProductService {

    ProductDTO createProduct(ProductForm productForm);

    ProductDTO getProduct(Long id);

    List<ProductDTO> getAllProducts();

    ProductDTO deleteProduct(Long id);

    ProductDTO updateProduct(Long id, ProductForm form);

}

