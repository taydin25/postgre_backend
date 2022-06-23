package com.example.tuna.service;
import com.example.tuna.dto.MenuDto;
import com.example.tuna.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.util.Optional;
public interface Menu_Service {
    MenuDto save(MenuDto mDto);
    void Delete(Long id);
    List<MenuDto> getAll();
    Optional<Menu> getMenuId(Long id);
    Page<MenuDto> getAll(Pageable pageable);
    void deleteMenu(Long id);
}
