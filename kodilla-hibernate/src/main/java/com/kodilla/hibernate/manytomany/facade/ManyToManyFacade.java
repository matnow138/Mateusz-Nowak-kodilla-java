package com.kodilla.hibernate.manytomany.facade;



import com.kodilla.hibernate.manytomany.facade.api.CompanyDtoDao;
import com.kodilla.hibernate.manytomany.facade.api.EmployeeDtoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManyToManyFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(ManyToManyFacade.class);
    @Autowired
    private CompanyDtoDao companyDtoDao;
    @Autowired
    private EmployeeDtoDao employeeDtoDao;



    public ManyToManyFacade(CompanyDtoDao companyDtoDao, EmployeeDtoDao employeeDtoDao){
        this.companyDtoDao = companyDtoDao;
        this.employeeDtoDao = employeeDtoDao;

    }



    public void saveCompany(CompanyDto companyDto){
        companyDtoDao.save(companyDto);
    }




    public void saveEmployee(EmployeeDto employee){
        employeeDtoDao.save(employee);
    }


    public List<CompanyDto> findCompanies(String name){
       List<CompanyDto> companies = companyDtoDao.findCompaniesByNameContains(name);
       return companies;
    }

    public List<EmployeeDto> findEmployee(String name){
        List<EmployeeDto> employees = employeeDtoDao.findEmployeeByLastnameContains(name);
        return employees;
    }



}
