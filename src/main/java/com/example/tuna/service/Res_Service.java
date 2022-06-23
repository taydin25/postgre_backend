package com.example.tuna.service;

import com.example.tuna.dto.resDto;
import com.example.tuna.dto.userDto;
import com.example.tuna.entity.Menu;
import com.example.tuna.entity.Restaurant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
public interface Res_Service {

    resDto save(resDto resDto);
    void Delete(Long id);
    List<resDto> getAll();
    Optional<Restaurant> getResId(Long id);
    Optional<Restaurant> getResName(String name);
    Page<resDto> getAll(Pageable pageable);

    void deleteRes(Long id);
}
