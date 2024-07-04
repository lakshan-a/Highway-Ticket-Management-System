package lk.ijse.ticketway.vehicleservice.repository;

import lk.ijse.ticketway.vehicleservice.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @version: v0.0.1
 * @author: lakshanR
 * @date: 6/30/2024
 */
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

}
