package com.example.tuna.service.impl;

import com.example.tuna.dto.AddressDto;
import com.example.tuna.entity.Address;
import com.example.tuna.entity.Menu;
import com.example.tuna.repostory.AddressRepo;
import com.example.tuna.service.Address_Service;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class Address_ServiceImpl implements Address_Service {
    private final AddressRepo aRepo;
    //    private Long res_id;
    //    private String city;
    //    private String district;
    //    private String hood;
    @Override
    public AddressDto save(AddressDto aDto) {
        Address address_o =new Address();
        address_o.setCity( aDto.getCity());
        address_o.setDistrict( aDto.getDistrict());
        address_o.setHood( aDto.getHood());
        final Address addb= aRepo.save(address_o);
        aDto.setAdd_id(addb.getAdd_id());
        return aDto;
    }

    @Override
    public void Delete(Long id) {

    }

    @Override
    public List<AddressDto> getAll() {
        List<Address> addresses=aRepo.findAll();
        List<AddressDto> addressDtos=new ArrayList<>();
        addresses.forEach(it ->{
            AddressDto addDto=new AddressDto();
            addDto.setAdd_id(it.getAdd_id());
            addDto.setCity(it.getCity());
            addDto.setDistrict(it.getDistrict());
            addDto.setHood(it.getHood());
            addressDtos.add(addDto);
        });

        return addressDtos;
    }

    @Override
    public Optional<Address> getAddId(Long id) {
        Optional<Address> address = aRepo.findById(id);
        return address;
    }
    public void deleteAddress(Long id) {
        aRepo.deleteById(id);
    }
    @Override
    public Page<AddressDto> getAll(Pageable pageable) {
        return null;
    }
}
