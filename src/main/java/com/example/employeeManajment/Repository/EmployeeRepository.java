package com.example.employeeManajment.Repository;

import com.example.employeeManajment.modele.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    Employee findEmployeeById(Long id);
Employee deleteEmployeeById(Long id) ;
    Employee findEmployeeByName(String name);
}
