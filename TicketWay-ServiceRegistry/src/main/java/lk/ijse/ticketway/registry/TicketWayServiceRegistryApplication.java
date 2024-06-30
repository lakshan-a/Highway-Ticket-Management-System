package lk.ijse.ticketway.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TicketWayServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(TicketWayServiceRegistryApplication.class, args);
    }

}
