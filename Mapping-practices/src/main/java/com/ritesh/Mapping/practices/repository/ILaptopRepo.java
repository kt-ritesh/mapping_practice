package com.ritesh.Mapping.practices.repository;

import com.ritesh.Mapping.practices.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILaptopRepo extends JpaRepository<Laptop, Long> {
}
