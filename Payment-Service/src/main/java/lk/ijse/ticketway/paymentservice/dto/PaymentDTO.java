package lk.ijse.ticketway.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author : savindaJ
 * @date : 2024-07-01
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private String paymentId;
    private String paymentType;
    private Double paymentAmount;
    private String paymentTime;
    private String paymentStatus;
    private String paymentLocation;
    private Long ticketId;
}
