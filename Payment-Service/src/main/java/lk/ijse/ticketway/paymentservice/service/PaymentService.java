package lk.ijse.ticketway.paymentservice.service;

import lk.ijse.ticketway.paymentservice.dto.PaymentDTO;
import lk.ijse.ticketway.paymentservice.util.ResponseDTO;

/**
 * @author : savindaJ
 * @date : 2024-07-01
 * @since : 0.1.0
 **/
public interface PaymentService {
    ResponseDTO add(PaymentDTO paymentDTO);

    ResponseDTO update(PaymentDTO paymentDTO);
}
