package com.example.InstagramProject.service;

import com.example.InstagramProject.model.InstagramFollowing;
import com.example.InstagramProject.model.User;
import com.example.InstagramProject.repo.IFollowingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FollowingService {
    @Autowired
    IFollowingRepo followingRepo;
    public void saveFollowing(User myUser, User otherUser) {
        InstagramFollowing followingRecord = new InstagramFollowing(null,myUser,otherUser);
        followingRepo.save(followingRecord);
    }
}