package com.example.tuna.service.impl;

import com.example.tuna.dto.userDto;
import com.example.tuna.entity.User;
import com.example.tuna.repostory.Userrepo;
import com.example.tuna.service.User_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class User_serviceImpl implements User_Service {
    private final Userrepo userrepo;

    @Override
    @Transactional
    public userDto save(userDto uDto) {
        //Assert.isNull(uDto.getUser_name(),"Bu alan zorunludur");
        User User_o =new User();
        User_o.setUser_name(uDto.getUser_name());
        final User userdb=userrepo.save(User_o);
        uDto.setUser_id(userdb.getUser_id());
        return uDto;
    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public List<userDto> getAll() {
        List<User> users=userrepo.findAll();
        List<userDto> userDtos=new ArrayList<>();
        users.forEach(it ->{
            userDto userDto=new userDto();
            userDto.setUser_id(it.getUser_id());
            userDto.setUser_name(it.getUser_name());
            userDtos.add(userDto);
        });

        return userDtos;
    }


    @Override
    public Page<userDto> getAll(Pageable pageable) {
        return null;
    }
}
