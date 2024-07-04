package lk.ijse.ticketway.vehicleservice.service;

import lk.ijse.ticketway.vehicleservice.dto.VehicleDTO;
import lk.ijse.ticketway.vehicleservice.util.ResponseDTO;

import java.util.List;

/**
 * @author : savindaJ
 * @date : 2024-07-01
 * @since : 0.1.0
 **/
public interface VehicleService {
    ResponseDTO registerVehicle(VehicleDTO vehicleDTO);

    ResponseDTO updateVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicles();

    ResponseDTO getVehicle(String id);
}
