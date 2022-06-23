package com.example.tuna.api;
import com.example.tuna.dto.MenuDto;
import com.example.tuna.entity.Category;
import com.example.tuna.entity.Menu;
import com.example.tuna.service.Menu_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/menu")
@RequiredArgsConstructor
public class MenuController {
    private final Menu_Service menu_service;
    @PostMapping
    public ResponseEntity<MenuDto> ekle(@RequestBody MenuDto menuDto){

        return  ResponseEntity.ok(menu_service.save(menuDto));
    }
    @GetMapping
    public ResponseEntity<List<MenuDto>> tumunuListele(){

        return  ResponseEntity.ok(menu_service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Menu>> getMenuById(@PathVariable("id") Long id){

        return  ResponseEntity.ok(menu_service.getMenuId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Menu>> delCategoryById(@PathVariable("id") Long id){
        menu_service.deleteMenu(id);
        return  ResponseEntity.ok(menu_service.getMenuId(id));
    }
}
