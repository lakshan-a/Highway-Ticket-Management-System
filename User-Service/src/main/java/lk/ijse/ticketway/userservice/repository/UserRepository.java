package lk.ijse.ticketway.userservice.repository;

import lk.ijse.ticketway.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/26/2024
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String name);
}
