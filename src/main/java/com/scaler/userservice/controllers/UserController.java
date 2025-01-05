package com.scaler.userservice.controllers;

import com.scaler.userservice.dtos.LoginRequestDto;
import com.scaler.userservice.dtos.LogoutRequestDto;
import com.scaler.userservice.dtos.SignupRequestDto;
import com.scaler.userservice.dtos.UserDto;
import com.scaler.userservice.models.Token;
import com.scaler.userservice.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;

    //constructor injection
    UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/signup")//as new User will be created in db
    public UserDto signupUser( @RequestBody SignupRequestDto requestDto){
        return null;
    }
    @PostMapping("/login")//as new token will be created in db
    public Token loginUser(@RequestBody LoginRequestDto requestDto){
        return null;
    }
    @PostMapping("/logout")//can be PUT as Token will be deleted
    public ResponseEntity<Void> logoutUser(@RequestBody LogoutRequestDto requestDto){
        return null;
    }
    @PostMapping("/validate/{token}") //can be Get as you are getting the user for which token
    public UserDto validateToken(@PathVariable String token){
        return null;
    }
    @GetMapping("{id}")
    public UserDto getUserById(@PathVariable String id){
        return null;
    }



}
