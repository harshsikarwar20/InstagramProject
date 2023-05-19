package com.example.InstagramProject.service;

import com.example.InstagramProject.model.InstagramFollower;
import com.example.InstagramProject.model.User;
import com.example.InstagramProject.repo.IFollowerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class FollowerService {
    @Autowired
    IFollowerRepo followerRepo;
    public void saveFollower(User myUser, User otherUser) {
        InstagramFollower follower = new InstagramFollower(null,myUser,otherUser);
        followerRepo.save(follower);
    }
}
