package com.example.employeeManajment.modele;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity

public class Employee implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(nullable = false,updatable = false)
    public int id;
    public String name;
    public String email;
     public String jobTitle;
    @Column(nullable = false,updatable = false)
     public String employeeCode;
     public String phone ;
     public String imgUrl ;



     public Employee(){}


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeCode='" + employeeCode + '\'' +
                ", phone='" + phone + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }

    public Employee( String name, String email, String jobTitle, String employeeCode, String phone, String imgUrl) {

        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.employeeCode = employeeCode;
        this.phone = phone;
        this.imgUrl = imgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
