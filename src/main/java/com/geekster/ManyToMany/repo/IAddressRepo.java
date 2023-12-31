package com.geekster.ManyToMany.repo;

import com.geekster.ManyToMany.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address, Integer> {
}
