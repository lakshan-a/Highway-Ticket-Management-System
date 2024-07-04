package lk.ijse.ticketway.paymentservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/27/2024
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentDTO {
    private Long id;
    private String paymentId;
    private String paymentType;
    private String paymentAmount;
    private String paymentDate;
    private String paymentTime;
    private String paymentStatus;
    private String paymentLocation;
    private Date date;
}
