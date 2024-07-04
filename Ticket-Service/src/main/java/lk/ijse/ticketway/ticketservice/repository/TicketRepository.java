package lk.ijse.ticketway.ticketservice.repository;

import lk.ijse.ticketway.ticketservice.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author : savindaJ
 * @date : 2024-06-28
 * @since : 0.1.0
 **/
@Repository
public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
