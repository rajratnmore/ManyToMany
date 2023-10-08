package com.geekster.ManyToMany.repo;

import com.geekster.ManyToMany.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmpRepo extends JpaRepository<Emp, Long> {
}
