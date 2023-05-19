package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User, Long> {
    User findFirstByEmail(String email);
    User findByUserId(Long id);
}