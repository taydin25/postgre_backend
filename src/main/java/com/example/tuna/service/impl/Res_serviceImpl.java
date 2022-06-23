package com.example.tuna.service.impl;
import com.example.tuna.dto.resDto;
import com.example.tuna.dto.userDto;
import com.example.tuna.entity.Menu;
import com.example.tuna.entity.Restaurant;
import com.example.tuna.entity.User;
import com.example.tuna.repostory.resrepo;
import com.example.tuna.service.Res_Service;
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
public class Res_serviceImpl implements Res_Service {
    private final resrepo resRepo;
    //Res_id,res_name,res_tanıtım,Cate_id,Menü_id;
    @Override
    @Transactional
    public resDto save(resDto resDto) {
        Restaurant Res_o =new Restaurant();
        Res_o.setRes_name(resDto.getRes_name());
        Res_o.setRes_tanitim(resDto.getRes_tanitim());
        Res_o.setAdr_id(resDto.getAdr_id());
        Res_o.setCate_id(resDto.getCate_id());
        Res_o.setMenu_id(resDto.getMenu_id());
        final Restaurant resdb=resRepo.save(Res_o);
        resDto.setRes_id(resdb.getRes_id());
        return resDto;

    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public List<resDto> getAll() {
        List<Restaurant> restaurants=resRepo.findAll();
        List<resDto> resDtos=new ArrayList<>();
        restaurants.forEach(it ->{
            resDto rDto=new resDto();
            rDto.setRes_id(it.getRes_id());
            rDto.setRes_name(it.getRes_name());
            rDto.setRes_tanitim(it.getRes_tanitim());
            rDto.setAdr_id(it.getAdr_id());
            rDto.setCate_id(it.getCate_id());
            rDto.setMenu_id(it.getMenu_id());
            resDtos.add(rDto);
        });
        return resDtos;
    }
    public Optional<Restaurant> getResId(Long id) {
        Optional<Restaurant> res =resRepo.findById(id);
        return res;
    }

    @Override
    public Optional<Restaurant> getResName(String name) {
        return Optional.empty();
    }

    @Override
    public Page<resDto> getAll(Pageable pageable) {
        return null;
    }
}
