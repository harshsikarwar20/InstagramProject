package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.InstagramComment;
import com.example.InstagramProject.model.PostLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILikeRepo extends JpaRepository<PostLike, Long> {
    long countByPost_PostId(Long postId);
}