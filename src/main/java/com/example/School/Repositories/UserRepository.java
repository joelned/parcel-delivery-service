package com.example.School.Repositories;

import com.example.School.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Integer > {
    User findByEmailAndHashedPassword(String email, String hashedPassword);
  List<User> findAll();
  List<User> findUsersByEmail(String email);
  User findUserByEmail(String email);
}
