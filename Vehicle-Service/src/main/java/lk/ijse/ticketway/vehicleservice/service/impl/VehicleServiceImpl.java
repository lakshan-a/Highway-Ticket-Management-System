package lk.ijse.ticketway.vehicleservice.service.impl;

import lk.ijse.ticketway.vehicleservice.dto.VehicleDTO;
import lk.ijse.ticketway.vehicleservice.entity.Vehicle;
import lk.ijse.ticketway.vehicleservice.repository.VehicleRepository;
import lk.ijse.ticketway.vehicleservice.service.VehicleService;
import lk.ijse.ticketway.vehicleservice.util.ResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/30/2024
 */
@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final ModelMapper mapper;

    public VehicleServiceImpl(VehicleRepository vehicleRepository, ModelMapper mapper) {
        this.vehicleRepository = vehicleRepository;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO registerVehicle(VehicleDTO vehicleDTO) {
        try {
            vehicleRepository.save(mapper.map(vehicleDTO, Vehicle.class));
            return new ResponseDTO("Vehicle Registered Successfully", 200);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @Override
    public ResponseDTO updateVehicle(VehicleDTO vehicleDTO) {
        try {
            vehicleRepository.save(mapper.map(vehicleDTO, Vehicle.class));
            return new ResponseDTO("Vehicle Updated Successfully", 200);
        } catch (Exception e) {
            return new ResponseDTO(e.getMessage(), 500);
        }
    }

    @Override
    public List<VehicleDTO> getAllVehicles() {
        return vehicleRepository.findAll().stream().map(vehicle -> mapper.map(vehicle, VehicleDTO.class)).toList();
    }
}
