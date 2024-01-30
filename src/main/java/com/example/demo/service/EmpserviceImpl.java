package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repositary.Emp_repo;

@Service
public  class EmpserviceImpl implements Empservice{

	@Autowired
	private Empservice empservice;
	
	@Autowired
	private Emp_repo emprepo;
	
	@Override
	public Employee saveEmp(Employee emp) {
		// TODO Auto-generated method stub
		Employee newemp = emprepo.save(emp); 
		return newemp;
	}

	@Override
	public List<Employee> getAllEmp() {
		// TODO Auto-generated method stub
		
		return emprepo.findAll();
	}

	@Override
	public Employee getEmpById(int id) {
		// TODO Auto-generated method stub
		
		return emprepo.findById(id).get();
	}

	@Override
	public boolean deleteEmp(int id) {
		// TODO Auto-generated method stub
		Employee emp = emprepo.findById(id).get();
		if(emp != null)
		{
			emprepo.delete(emp);
			return true;
		}
		return false;
	}

	

	
}
