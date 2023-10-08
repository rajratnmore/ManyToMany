package com.geekster.ManyToMany.service;


import com.geekster.ManyToMany.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;
}
