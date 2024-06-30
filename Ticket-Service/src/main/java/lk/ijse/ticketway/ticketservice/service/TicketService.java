package lk.ijse.ticketway.ticketservice.service;

import lk.ijse.ticketway.ticketservice.dto.TicketDTO;
import lk.ijse.ticketway.ticketservice.util.ResponseDTO;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/27/2024
 */
public interface TicketService {
    ResponseDTO save(TicketDTO ticketDTO);

    ResponseDTO update(TicketDTO ticketDTO);

    ResponseDTO getAll();
}
