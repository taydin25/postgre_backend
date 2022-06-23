package com.example.tuna.api;
import com.example.tuna.dto.resDto;
import com.example.tuna.dto.userDto;
import com.example.tuna.entity.Menu;
import com.example.tuna.entity.Restaurant;
import com.example.tuna.entity.User;
import com.example.tuna.service.Res_Service;
import com.example.tuna.service.User_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restaurant")
@RequiredArgsConstructor
public class RestaurantController {
    private final Res_Service res_service;
    @PostMapping
    public ResponseEntity<resDto> ekle(@RequestBody resDto ResDto){

        return  ResponseEntity.ok(res_service.save(ResDto));
    }
    @GetMapping
    public ResponseEntity<List<resDto>> tumunuListele(){

        return  ResponseEntity.ok(res_service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Restaurant>> getResById(@PathVariable("id") Long id){

        return  ResponseEntity.ok( res_service.getResId(id));
    }
    /*@GetMapping("/{name}")
    public ResponseEntity<Optional<Restaurant>> getResByName(@PathVariable("name") String name){

        return  ResponseEntity.ok( res_service.getResName(name));
    }*/

}
