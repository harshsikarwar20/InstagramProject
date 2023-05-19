package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.InstagramFollowing;
import com.example.InstagramProject.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFollowingRepo extends JpaRepository<InstagramFollowing, Long> {

    Long countByUser_userId(long userId);
}