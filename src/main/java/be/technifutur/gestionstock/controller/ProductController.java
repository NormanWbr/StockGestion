package be.technifutur.gestionstock.controller;

import be.technifutur.gestionstock.model.dto.ProductDTO;
import be.technifutur.gestionstock.model.form.ProductForm;
import be.technifutur.gestionstock.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class ProductController {

    private final ProductService _productService;

    public ProductController(ProductService _productService) {
        this._productService = _productService;
    }

    @CrossOrigin("*")
    @GetMapping("/{id}")
    ProductDTO getOne(@PathVariable("id") Long id) {
        return _productService.getProduct(id);
    }

    @CrossOrigin("*")
    @GetMapping("/all")
    List<ProductDTO> getAll() {
        return null;
    }

    @CrossOrigin("*")
    @PostMapping("/create")
    void create(@RequestBody ProductForm form) {
        _productService.createProduct(form);
    }

    @CrossOrigin("*")
    @PostMapping("/delete/{id}")
    void delete(@PathVariable("id") Long id) {
        _productService.deleteProduct(id);
    }

    @CrossOrigin("*")
    @PatchMapping("/update")
    ProductDTO update(Long id, int quantity) {
        return null;
    }


}
