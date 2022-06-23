package com.example.tuna.service;

import com.example.tuna.dto.userDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface User_Service {

    userDto save(userDto uDto);

    void Delete(Long id);
    List<userDto> getAll();
    Page<userDto> getAll(Pageable pageable);
}
