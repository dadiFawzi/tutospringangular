package com.example.employeeManajment.Service;

import com.example.employeeManajment.Repository.EmployeeRepository;
import com.example.employeeManajment.modele.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    EmployeeRepository EmployeeRepo;


    @Autowired
    public EmployeeService(EmployeeRepository employeeRepo){
        this.EmployeeRepo=employeeRepo;
    }

    public List<Employee> fidAllEmployee(){
        return EmployeeRepo.findAll();
    }

    public Employee deleteEmployeeById(Long id){
        return EmployeeRepo.deleteEmployeeById(id);
    }

    public Employee updateEmployee(Employee e){
     return   EmployeeRepo.save(e);
    }

    public Employee findEmployeeById(Long id){
        return  EmployeeRepo.findEmployeeById(id);
    }

    public Employee findEmployeeByName(String name){
        return EmployeeRepo.findEmployeeByName(name);
    }

    public Employee saveEmployee(Employee employee) {
             return EmployeeRepo.save(employee);
    }
}
