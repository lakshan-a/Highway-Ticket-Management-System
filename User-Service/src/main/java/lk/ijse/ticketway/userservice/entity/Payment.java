package lk.ijse.ticketway.userservice.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.Date;

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
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String paymentId;
    private String paymentType;
    private Double paymentAmount;
    private String paymentTime;
    private String paymentStatus;
    private String paymentLocation;
    @CreationTimestamp
    private Timestamp date;

    @OneToOne
    private Ticket ticket;
}
