package lk.ijse.ticketway.vehicleservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @author : savindaJ
 * @date : 2024-07-01
 * @since : 0.1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VehicleDTO {
    private Long id;
    private String vehicleNumber;
    private String vehicleType;
    private String vehicleBrand;
    private String vehicleModel;
    private String vehicleYear;
    private String vehicleColor;
    private String vehicleFuelType;
    private String vehicleTransmissionType;
    private String vehicleEngineCapacity;
    private String vehicleMileage;
    private String vehicleStatus;
    private String vehicleLocation;
    private Timestamp vehicleTime;
}
