package be.technifutur.gestionstock.model.dto;

import be.technifutur.gestionstock.model.entity.Product;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {


    private Long id;

    private String name;

    private Integer quantity;

    private Integer price;

    public static ProductDTO toDTO(Product product) {
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .build();
    }

}
