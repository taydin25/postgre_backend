package com.example.tuna.api;
import com.example.tuna.dto.AddressDto;
import com.example.tuna.entity.Address;
import com.example.tuna.entity.Menu;
import com.example.tuna.service.Address_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final Address_Service address_service;
    @PostMapping
    public ResponseEntity<AddressDto> ekle(@RequestBody AddressDto aDto){

        return  ResponseEntity.ok(address_service.save(aDto));
    }
    @GetMapping
    public ResponseEntity<List<AddressDto>> tumunuListele(){

        return  ResponseEntity.ok(address_service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Address>> getAddById(@PathVariable("id") Long id){

        return  ResponseEntity.ok(address_service.getAddId(id));
    }

}
