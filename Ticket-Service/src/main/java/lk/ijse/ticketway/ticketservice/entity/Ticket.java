package lk.ijse.ticketway.ticketservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/26/2024
 */
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ticketId;
    private String ticketType;
    private String ticketPrice;
    private String ticketQty;
    private String ticketDate;
    private String ticketTime;
    private String ticketStatus;
    private String ticketLocation;

    @ManyToOne
    private User user;

    @OneToOne(mappedBy = "ticket")
    private Payment payment;

    @ManyToOne
    private Vehicle vehicle;
}
