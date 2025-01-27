package com.danieldcn05.ticket_backend.ticket_backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danieldcn05.ticket_backend.ticket_backend.dtos.UserDTO;
import com.danieldcn05.ticket_backend.ticket_backend.models.User;
import com.danieldcn05.ticket_backend.ticket_backend.services.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController// Esta anotación se utiliza para crear servicios web RESTful utilizando Spring MVC
@RequestMapping("api/v1/users") // El inicio de la URL para acceder a los métodos de esta clase
public class UserController {

    @Autowired // Inyección de dependencias
    private UserService userService;


    @PostMapping("") // Indica que este método se ejecutará cuando se haga una petición POST a la URL /api/v1/users
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {
        try {
            User newUser = userService.createUser(userDTO);    
            return new ResponseEntity<>(newUser, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
        

       
    }
    
}
