package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    public ManyToManyFacade(CompanyDao companyDao, EmployeeDao employeeDao){
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;

    }

    public void saveCompany(String name){
        companyDao.save(new Company(name));
    }

    public void saveEmployee(String name, String surname){
        employeeDao.save(new Employee(name, surname));
    }


    public List<Company> findCompanies(String name){
       List<Company> companies = companyDao.findCompaniesByNameContains(name);
       return companies;
    }

    public List<Employee> findEmployee(String name){
        List<Employee> employees = employeeDao.findEmployeeByLastnameContains(name);
        return employees;
    }



}
