package lk.ijse.ticketway.ticketservice.controller;

import lk.ijse.ticketway.ticketservice.dto.TicketDTO;
import lk.ijse.ticketway.ticketservice.service.TicketService;
import lk.ijse.ticketway.ticketservice.util.ResponseDTO;
import org.springframework.web.bind.annotation.*;

/**
 * @author : savindaJ
 * @date : 2024-06-24
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("/actions")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping("/save")
    public ResponseDTO add(@RequestBody TicketDTO ticketDTO) {
        try {
            return ticketService.save(ticketDTO);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);

        }
    }

    @PutMapping("/update")
    public ResponseDTO update(@RequestBody TicketDTO ticketDTO) {
        try {
            return ticketService.update(ticketDTO);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @GetMapping
    public ResponseDTO get() {
        try {
            return ticketService.getAll();
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

}
