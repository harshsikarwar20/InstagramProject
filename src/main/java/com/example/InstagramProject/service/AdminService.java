package com.example.InstagramProject.service;

import com.example.InstagramProject.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdminService {
    @Autowired
    UserService userService;

    @Autowired
    private IAdminRepo adminRepo;

    public String toggleBlueTick(Long id, boolean blueTick) {
        return userService.toggleBlueTick(id,blueTick);
    }
}