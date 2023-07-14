package com.ritesh.Mapping.practices.service;

import com.ritesh.Mapping.practices.model.Address;
import com.ritesh.Mapping.practices.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public String  addAddress(Address address) {

        addressRepo.save(address);
        return "New address added";
    }

    public String deleteAddressById(Long id) {

        addressRepo.deleteById(id);
        return "A address Deleted";
    }

    public Iterable<Address> getAllAddress() {

        return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long id) {

        return addressRepo.findById(id);
    }
}
