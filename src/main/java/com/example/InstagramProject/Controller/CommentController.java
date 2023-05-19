package com.example.InstagramProject.Controller;

import com.example.InstagramProject.model.InstagramComment;
import com.example.InstagramProject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("comment")
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping()
    String addComment(@RequestBody InstagramComment comment) {
        return commentService.addComment(comment);
    }
}