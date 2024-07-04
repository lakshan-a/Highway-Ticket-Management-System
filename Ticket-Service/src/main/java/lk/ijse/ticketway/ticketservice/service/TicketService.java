package lk.ijse.ticketway.ticketservice.service;

import lk.ijse.ticketway.ticketservice.dto.TicketDTO;
import lk.ijse.ticketway.ticketservice.util.ResponseDTO;

/**
 * @author : savindaJ
 * @date : 2024-06-28
 * @since : 0.1.0
 **/
public interface TicketService {
    ResponseDTO save(TicketDTO ticketDTO);

    ResponseDTO update(TicketDTO ticketDTO);

    ResponseDTO getAll();

    ResponseDTO getTicket(Long id);
}
