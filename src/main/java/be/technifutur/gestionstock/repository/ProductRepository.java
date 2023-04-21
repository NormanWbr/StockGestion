package be.technifutur.gestionstock.repository;

import be.technifutur.gestionstock.model.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
