package com.danieldcn05.ticket_backend.ticket_backend.services;

import com.danieldcn05.ticket_backend.ticket_backend.dtos.UserDTO;
import com.danieldcn05.ticket_backend.ticket_backend.models.User;

public interface UserService {

    User createUser(UserDTO userDTO);
    User getUserById(Long id);
    User deleteUserById(Long id);
}
