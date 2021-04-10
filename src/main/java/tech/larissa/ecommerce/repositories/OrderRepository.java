package tech.larissa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.larissa.ecommerce.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
