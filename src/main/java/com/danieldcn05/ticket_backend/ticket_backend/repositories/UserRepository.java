package com.danieldcn05.ticket_backend.ticket_backend.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.danieldcn05.ticket_backend.ticket_backend.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

    boolean existsById(Long id);

    Optional<User> findById(Long id);

}
