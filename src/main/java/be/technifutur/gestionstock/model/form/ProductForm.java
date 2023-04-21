package be.technifutur.gestionstock.model.form;

import be.technifutur.gestionstock.model.entity.Product;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ProductForm {

    @NotNull
    private String name;

    @NotNull
    private Integer quantity;

    public Product toEntity() {
        Product product = new Product();
        product.setName(this.name);
        product.setQuantity(this.quantity);
        return product;
    }

}
