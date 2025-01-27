package com.danieldcn05.ticket_backend.ticket_backend.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

    // Constructor con un mensaje de error
    public EmailAlreadyExistsException(String message) {
        super(message); // Llama al constructor de la clase base RuntimeException
    }

    // Constructor con mensaje de error y causa
    public EmailAlreadyExistsException(String message, Throwable cause) {
        super(message, cause); // Llama al constructor de la clase base RuntimeException
    }
}