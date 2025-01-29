package com.danieldcn05.ticket_backend.ticket_backend.exceptions;

public class UserNotFoundException extends RuntimeException {

    // Constructor con un mensaje de error
    public UserNotFoundException(String message) {
        super(message); // Llama al constructor de la clase base RuntimeException
    }

    // Constructor con mensaje de error y causa
    public UserNotFoundException(String message, Throwable cause) {
        super(message, cause); // Llama al constructor de la clase base RuntimeException
    }

}
