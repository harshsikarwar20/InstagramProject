package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.Admin;
import com.example.InstagramProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepo extends JpaRepository<Admin, Long> {
}