package tech.larissa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.larissa.ecommerce.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
