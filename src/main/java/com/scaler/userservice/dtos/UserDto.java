package com.scaler.userservice.dtos;

import com.scaler.userservice.models.Role;

import java.util.List;

public class UserDto {
    private String name;
    private String email;
    private List<Role> roles;
}
