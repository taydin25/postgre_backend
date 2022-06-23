package com.example.tuna.service;

import com.example.tuna.dto.AddressDto;
import com.example.tuna.entity.Address;
import com.example.tuna.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface Address_Service {
    AddressDto save(AddressDto aDto);
    void Delete(Long id);
    List<AddressDto> getAll();
    Optional<Address> getAddId(Long id);
    Page<AddressDto> getAll(Pageable pageable);
}
