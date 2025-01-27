package com.danieldcn05.ticket_backend.ticket_backend.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danieldcn05.ticket_backend.ticket_backend.dtos.UserDTO;
import com.danieldcn05.ticket_backend.ticket_backend.exceptions.EmailAlreadyExistsException;
import com.danieldcn05.ticket_backend.ticket_backend.models.User;
import com.danieldcn05.ticket_backend.ticket_backend.repositories.UserRepository;
import com.danieldcn05.ticket_backend.ticket_backend.services.UserService;

@Service // Indicar que esta clase es un servicio
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserDTO userDTO) {
        // Verifica si el email ya está en uso
        if (userRepository.existsByEmail(userDTO.getEmail())) {
            throw new EmailAlreadyExistsException("El correo electrónico ya está en uso.");
        }

        User user = new User(); // Crear un nuevo usuario

        // Asignar los valores del DTO a la nueva entidad
        user.setName(userDTO.getName());
        user.setFirstLastName(userDTO.getFirstLastName());
        user.setSecondLastName(userDTO.getSecondLastName());
        user.setPassword(userDTO.getPassword());
        user.setEmail(userDTO.getEmail());
        user.setTlf(userDTO.getTlf());
        user.setRole(userDTO.getRole());

        // Guardar el nuevo usuario en la base de datos
        return userRepository.save(user);
    }
}
