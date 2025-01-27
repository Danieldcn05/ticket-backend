package com.danieldcn05.ticket_backend.ticket_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.danieldcn05.ticket_backend.ticket_backend.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    boolean existsByEmail(String email);

}
