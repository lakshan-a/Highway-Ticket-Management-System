package lk.ijse.ticketway.ticketservice.repository;

import lk.ijse.ticketway.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/27/2024
 */
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
