package com.example.employeeManajment.Controller;

import com.example.employeeManajment.Service.EmployeeService;
import com.example.employeeManajment.modele.Employee;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "/employee")

public class EmployeeController {
    public EmployeeService employeeService;


    public EmployeeController(EmployeeService es){
        this.employeeService=es;
    }

@GetMapping("")
public String sayHello(){
        return "hello";
}
    @GetMapping(value = "all")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return new ResponseEntity<>( employeeService.fidAllEmployee(), HttpStatus.OK) ;
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        return new ResponseEntity<>( employeeService.findEmployeeById(id), HttpStatus.OK) ;
    }

    @PostMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody  Employee employee){
        return new ResponseEntity<>(employeeService.updateEmployee(employee),HttpStatus.OK);

    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody  Employee employee){
        return new ResponseEntity<>(employeeService.saveEmployee(employee),HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Employee> addEmployee(@PathVariable("id") Long id){
        return new ResponseEntity<>(employeeService.deleteEmployeeById(id),HttpStatus.OK);

    }

}
