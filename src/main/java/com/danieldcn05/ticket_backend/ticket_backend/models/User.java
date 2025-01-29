package com.danieldcn05.ticket_backend.ticket_backend.models;



import com.danieldcn05.ticket_backend.ticket_backend.enums.Role;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity // Esta anotación indica que la clase User es una entidad de la base de datos
@Table(name = "users") // Nombre de la tabla en la base de datos
@Data // Anotación de Lombok para generar automáticamente los getters y setters
@SequenceGenerator(name = "user_seq", sequenceName = "users_seq", initialValue = 1, allocationSize = 1) // Genera automáticamente el valor del campo id
public class User {


    @Id // Indica que el campo id es la clave primaria
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
    private int id;

    @Column(name = "name", length = 50) // Nombre de la columna en la base de datos y longitud máxima
    private String name;

    @Column(name = "first_last_name", length = 50)
    private String firstLastName;

    @Column(name = "second_last_name", length = 50)
    private String secondLastName;

    @Column(name = "password", length = 255)
    private String password; 

    @Column(name = "email", length = 254, unique = true) // Indica que el campo email es único
    private String email;

    @Column(name = "tlf", length = 10)
    private String tlf;

    @Enumerated(EnumType.STRING) // Indica que el campo role es de tipo Enum
    @Column(name = "role")
    private Role role;

    @Column(name = "active")
    private boolean active = true;
}
