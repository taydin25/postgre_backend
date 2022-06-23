package com.example.tuna.service;

import com.example.tuna.dto.CategoryDto;
import com.example.tuna.entity.Category;
import com.example.tuna.entity.Menu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface Category_Service {
    CategoryDto save(CategoryDto cDto);
    void Delete(Long id);
    Optional<Category> getCategoryId(Long id);
    List<CategoryDto> getAll();
    Page<CategoryDto> getAll(Pageable pageable);
    void deleteCategory(Long id);
}
