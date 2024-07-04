package lk.ijse.ticketway.paymentservice.repository;

import lk.ijse.ticketway.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-07-01
 * @since : 0.1.0
 **/
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
