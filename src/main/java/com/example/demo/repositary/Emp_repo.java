package com.example.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Employee;

public interface Emp_repo  extends JpaRepository<Employee, Integer>{

}
