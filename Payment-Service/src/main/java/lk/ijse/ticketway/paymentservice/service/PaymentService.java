package lk.ijse.ticketway.paymentservice.service;

import lk.ijse.ticketway.paymentservice.dto.PaymentDTO;
import lk.ijse.ticketway.paymentservice.util.ResponseDTO;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 7/1/2024
 */
public interface PaymentService {
    ResponseDTO add(PaymentDTO paymentDTO);

    ResponseDTO update(PaymentDTO paymentDTO);
}
