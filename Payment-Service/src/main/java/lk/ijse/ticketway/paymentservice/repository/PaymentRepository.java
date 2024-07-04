package lk.ijse.ticketway.paymentservice.repository;

import lk.ijse.ticketway.paymentservice.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 7/1/2024
 */
@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}