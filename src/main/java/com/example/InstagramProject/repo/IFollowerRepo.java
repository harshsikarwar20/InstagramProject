package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.InstagramFollower;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowerRepo extends JpaRepository<InstagramFollower, Long> {
}
