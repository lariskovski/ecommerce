package tech.larissa.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.larissa.ecommerce.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
