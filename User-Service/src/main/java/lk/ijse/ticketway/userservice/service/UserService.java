package lk.ijse.ticketway.userservice.service;

import lk.ijse.ticketway.userservice.dto.LoginDTO;
import lk.ijse.ticketway.userservice.dto.UserDTO;

/**
 * @author : savindaJ
 * @date : 2024-06-26
 * @since : 0.1.0
 **/
public interface UserService {
    void registerUser(UserDTO userDTO);

    boolean loginUser(LoginDTO loginDTO);

    void updateUser(UserDTO userDTO);

    UserDTO getUser(String email);
}
