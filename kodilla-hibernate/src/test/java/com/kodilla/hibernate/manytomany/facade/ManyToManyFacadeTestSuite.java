package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    ManyToManyFacade manyToManyFacade;
    @Transactional
    @Test
    public void findCompanyWithStringTest(){
        //Given
        manyToManyFacade.saveCompany("Onet");
        manyToManyFacade.saveCompany("WP");
        manyToManyFacade.saveCompany("WPolsce");
        manyToManyFacade.saveCompany("netNews");

        manyToManyFacade.saveEmployee("John", "Nowalski");
        manyToManyFacade.saveEmployee("Jan", "Kowalski");
        manyToManyFacade.saveEmployee("Jane", "Does");
        manyToManyFacade.saveEmployee("Bill", "Gates");

        //When
        List<Company> companies = manyToManyFacade.findCompanies("WP");
        List<Employee> employees = manyToManyFacade.findEmployee("ski");
        //Then
        assertEquals(2, companies.size());
        assertEquals(2, employees.size());
        //CleanUp

    }


}
