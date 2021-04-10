package tech.larissa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.larissa.ecommerce.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
