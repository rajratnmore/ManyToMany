package com.geekster.ManyToMany.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String addressName;

    @ManyToMany
    @JoinTable(name = "address_emp_m_m_mapping",joinColumns = @JoinColumn(name = "fk_address"), inverseJoinColumns = @JoinColumn(name = "fk_emp"))
    List<Emp> employees;
}
