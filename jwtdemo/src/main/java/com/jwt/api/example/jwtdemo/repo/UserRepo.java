package com.jwt.api.example.jwtdemo.repo;

import com.jwt.api.example.jwtdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
