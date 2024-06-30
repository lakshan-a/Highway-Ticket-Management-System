package lk.ijse.ticketway.paymentservice.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/27/2024
 */
@RestController
@RequestMapping("/actions")
public class PaymentController {

    @PostMapping("/validate")
    public String add() {
        return "Add";
    }

    @PostMapping("/process")
    public String update() {
        return "Update";
    }
}
