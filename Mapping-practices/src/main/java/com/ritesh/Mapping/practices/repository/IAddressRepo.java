package com.ritesh.Mapping.practices.repository;

import com.ritesh.Mapping.practices.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Long> {
}
