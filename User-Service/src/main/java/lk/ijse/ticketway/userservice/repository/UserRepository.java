package lk.ijse.ticketway.userservice.repository;

import lk.ijse.ticketway.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-06-26
 * @since : 0.1.0
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
    User findByEmail(String name);
}
