package com.ritesh.Mapping.practices.service;

import com.ritesh.Mapping.practices.model.Laptop;
import com.ritesh.Mapping.practices.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public String addLaptop(Laptop laptop) {

        laptopRepo.save(laptop);
        return "New laptop added";
    }

    public String deleteLaptopById(Long id) {

        laptopRepo.deleteById(id);

        return "A laptop deleted";
    }

    public Iterable<Laptop> getAllLaptop() {
        return laptopRepo.findAll();
    }

    public Optional<Laptop> getLaptopById(Long id) {

        return laptopRepo.findById(id);
    }
}
