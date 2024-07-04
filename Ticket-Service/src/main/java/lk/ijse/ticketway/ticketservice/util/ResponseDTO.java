package lk.ijse.ticketway.ticketservice.util;

import lombok.*;

import java.util.HashMap;

/**
 * @author : savindaJ
 * @date : 2024-06-28
 * @since : 0.1.0
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private int status;
    private String message;
    private HashMap<String, Object> data = new HashMap<>();

    public ResponseDTO(String message, int status) {
        this.message = message;
        this.status = status;
    }
}
