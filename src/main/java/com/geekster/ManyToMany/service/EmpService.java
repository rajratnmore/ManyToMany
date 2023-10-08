package com.geekster.ManyToMany.service;

import com.geekster.ManyToMany.repo.IEmpRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {

    @Autowired
    IEmpRepo empRepo;
}
