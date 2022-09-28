package com.kodilla.hibernate.manytomany.facade;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "COMPANIES")
public class CompanyDto {

    private int id;
    private String name;
    private List<EmployeeDto> employees = new ArrayList<>();

    public CompanyDto() {
    }

    public CompanyDto(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "COMPANY_ID", unique = true)
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "COMPANY_NAME")
    public String getName() {
        return name;
    }

    private void setId(int id) {
        this.id = id;
    }

    private void setName(String name) {
        this.name = name;
    }
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "companies")
    public List<EmployeeDto> getEmployees() {
        return employees;
    }

    public void setEmployees(List<EmployeeDto> employees) {
        this.employees = employees;
    }
}