package com.ritesh.Mapping.practices.controller;

import com.ritesh.Mapping.practices.model.Address;
import com.ritesh.Mapping.practices.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    String addAddress(@RequestBody Address address){
        return addressService.addAddress(address);
    }

    @DeleteMapping("address/{Id}")
    String deleteAddressById(@PathVariable Long id){
        return addressService.deleteAddressById(id);
    }

    @GetMapping("addresses")
    Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @GetMapping("address/{id}")
    Optional<Address> getAddressById(@PathVariable Long id){
        return addressService.getAddressById(id);
    }

}
