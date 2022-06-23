package com.example.tuna.service.impl;

import com.example.tuna.dto.MenuDto;
import com.example.tuna.entity.Menu;
import com.example.tuna.repostory.MenuRepo;
import com.example.tuna.service.Menu_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Menu_ServiceImpl implements Menu_Service {
    private final MenuRepo mRepo;


    //Res_id,res_name,res_tanıtım,Cate_id,Menü_id;
    @Override
    @Transactional
    public MenuDto save(MenuDto mDto) {
        //Menu_id,Menu_name,price;
        Menu Menu_o =new Menu();
        Menu_o.setMenu_name(mDto.getMenu_name());
        Menu_o.setPrice(mDto.getPrice());
        final Menu menudb=mRepo.save(Menu_o);
        mDto.setMenu_id(menudb.getMenu_id());
        return mDto;
    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public List<MenuDto> getAll() {
     //    private Long Menu_id;
     //    private String Menu_name;
     //    private Double price;
        List<Menu> restaurants=mRepo.findAll();
        List<MenuDto> mDtos=new ArrayList<>();
        restaurants.forEach(it ->{
            MenuDto mDto=new MenuDto();
            mDto.setMenu_id(it.getMenu_id());
            mDto.setMenu_name(it.getMenu_name());
            mDto.setPrice(it.getPrice());
            mDtos.add(mDto);
        });
        return mDtos;

    }

    @Override
    public Optional<Menu> getMenuId(Long id) {
        Optional<Menu> menu =mRepo.findById(id);
        return menu;
    }

    @Override
    public Page<MenuDto> getAll(Pageable pageable) {
        return null;
    }
}
