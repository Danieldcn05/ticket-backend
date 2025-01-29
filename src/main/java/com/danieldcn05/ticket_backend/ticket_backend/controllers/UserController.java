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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController // Esta anotación se utiliza para crear servicios web RESTful utilizando Spring
                // MVC
@RequestMapping("api/v1/users") // El inicio de la URL para acceder a los métodos de esta clase
public class UserController {

    @Autowired // Inyección de dependencias
    private UserService userService;

    @PostMapping("") // Indica que este método se ejecutará cuando se haga una petición POST a la URL
                     // /api/v1/users
    public ResponseEntity<?> createUser(@RequestBody UserDTO userDTO) {

        User newUser = userService.createUser(userDTO);
        return new ResponseEntity<>(newUser, HttpStatus.CREATED);

    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = userService.getUserById(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @PatchMapping("/del/{id}")
    public ResponseEntity<User> deleteUser(@PathVariable Long id) {
        User user = userService.deleteUserById(id);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

}
