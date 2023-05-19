package com.example.InstagramProject.repo;

import com.example.InstagramProject.model.Admin;
import com.example.InstagramProject.model.InstagramComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICommentRepo extends JpaRepository<InstagramComment, Long> {
}
