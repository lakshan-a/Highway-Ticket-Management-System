package lk.ijse.ticketway.vehicleservice.service;

import lk.ijse.ticketway.vehicleservice.dto.VehicleDTO;
import lk.ijse.ticketway.vehicleservice.util.ResponseDTO;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/30/2024
 */
public interface VehicleService {
    ResponseDTO registerVehicle(VehicleDTO vehicleDTO);

    ResponseDTO updateVehicle(VehicleDTO vehicleDTO);

    List<VehicleDTO> getAllVehicles();
}
