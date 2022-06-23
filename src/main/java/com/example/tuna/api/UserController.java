package com.example.tuna.api;

import com.example.tuna.dto.userDto;
import com.example.tuna.entity.User;
import com.example.tuna.service.User_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final User_Service user_service;
    @PostMapping
    public ResponseEntity<userDto> ekle(@RequestBody userDto UserDto){

        return  ResponseEntity.ok(user_service.save(UserDto));
    }
    @GetMapping
    public ResponseEntity<List<userDto>> tumunuListele(){

        return  ResponseEntity.ok(user_service.getAll());
    }
}
