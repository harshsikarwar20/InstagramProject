package com.example.InstagramProject.service;

import com.example.InstagramProject.model.InstagramComment;
import com.example.InstagramProject.repo.ICommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CommentService {
    @Autowired
    ICommentRepo commentRepo;
    //definitely make use of authentication
    public String addComment(InstagramComment comment) {
        InstagramComment rComment = commentRepo.save(comment);
        if(rComment == null) {
            return "Comment not saved...!";
        }
        else {
            return "Comment saved...!";
        }
    }
}