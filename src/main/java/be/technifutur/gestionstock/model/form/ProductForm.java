package be.technifutur.gestionstock.model.form;

import be.technifutur.gestionstock.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductForm {

    @NotNull
    private String name;

    private Integer quantity;

    private Integer price;

    public Product toEntity() {
        Product product = new Product();
        product.setName(this.name);
        product.setQuantity(this.quantity);
        product.setPrice(this.price);
        return product;
    }

}
