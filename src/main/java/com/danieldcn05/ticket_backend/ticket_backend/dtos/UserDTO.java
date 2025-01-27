package com.danieldcn05.ticket_backend.ticket_backend.dtos;

import com.danieldcn05.ticket_backend.ticket_backend.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    
    private String name;
  
    private String firstLastName;

    private String secondLastName;

    private String password; 

    private String email;

    private String tlf;

    private Role role;
}
