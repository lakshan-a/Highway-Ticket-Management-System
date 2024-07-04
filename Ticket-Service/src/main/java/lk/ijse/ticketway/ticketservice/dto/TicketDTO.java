package lk.ijse.ticketway.ticketservice.dto;

import lombok.*;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/27/2024
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TicketDTO {
    private Long id;
    private String ticketId;
    private String ticketType;
    private String ticketPrice;
    private String ticketQty;
    private String ticketDate;
    private String ticketTime;
    private String ticketStatus;
    private String ticketLocation;
    private String userName;
    private String vehicleNumber;
}
