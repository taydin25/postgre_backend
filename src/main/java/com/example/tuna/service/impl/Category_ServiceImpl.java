package com.example.tuna.service.impl;

import com.example.tuna.dto.CategoryDto;
import com.example.tuna.dto.userDto;
import com.example.tuna.entity.Category;
import com.example.tuna.entity.Menu;
import com.example.tuna.entity.User;
import com.example.tuna.repostory.CategoryRepo;
import com.example.tuna.repostory.MenuRepo;
import com.example.tuna.service.Category_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Category_ServiceImpl implements Category_Service {
    private final CategoryRepo cRepo;
    @Override
    public CategoryDto save(CategoryDto cDto) {
        //Cat_id ,Cat_name
        Category cat_o =new Category();
        cat_o.setCat_name( cDto.getCat_name());
        final Category catedb= cRepo.save(cat_o);
        cDto.setCat_id(catedb.getCat_id());
        return cDto;
    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public Optional<Category> getCategoryId(Long id) {
        Optional<Category> category =cRepo.findById(id);
        return category;
    }

    @Override
    public List<CategoryDto> getAll() {
        List<Category> categories=cRepo.findAll();
        List<CategoryDto> cDtos=new ArrayList<>();
        categories.forEach(it ->{
            CategoryDto categoryDto=new CategoryDto();
            categoryDto.setCat_id(it.getCat_id());
            categoryDto.setCat_name(it.getCat_name());
            cDtos.add(categoryDto);
        });

        return cDtos;
    }

    @Override
    public Page<CategoryDto> getAll(Pageable pageable) {
        return null;
    }

    @Override
    public void deleteCategory(Long id) {
        cRepo.deleteById(id);
    }
}
