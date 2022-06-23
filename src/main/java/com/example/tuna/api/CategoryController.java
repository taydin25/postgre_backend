package com.example.tuna.api;
import com.example.tuna.dto.CategoryDto;
import com.example.tuna.dto.resDto;
import com.example.tuna.dto.userDto;
import com.example.tuna.entity.Category;
import com.example.tuna.entity.Menu;
import com.example.tuna.entity.User;
import com.example.tuna.service.Category_Service;
import com.example.tuna.service.Res_Service;
import com.example.tuna.service.User_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class CategoryController {
    private final Category_Service category_service;
    @PostMapping
    public ResponseEntity<CategoryDto> ekle(@RequestBody CategoryDto cDto){

        return  ResponseEntity.ok(category_service.save(cDto));
    }
    @GetMapping
    public ResponseEntity<List<CategoryDto>> tumunuListele(){

        return  ResponseEntity.ok(category_service.getAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Category>> getCategoryById(@PathVariable("id") Long id){

        return  ResponseEntity.ok(category_service.getCategoryId(id));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Optional<Category>> delCategoryById(@PathVariable("id") Long id){
        category_service.deleteCategory(id);
        return  ResponseEntity.ok(category_service.getCategoryId(id));
    }
}
