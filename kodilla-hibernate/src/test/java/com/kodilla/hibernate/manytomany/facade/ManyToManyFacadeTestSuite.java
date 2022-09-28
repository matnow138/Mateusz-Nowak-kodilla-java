package com.kodilla.hibernate.manytomany.facade;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ManyToManyFacadeTestSuite {

    @Autowired
    ManyToManyFacade manyToManyFacade;

    @Transactional
    @Test
    public void findCompanyWithStringTest() {
        //Given
        CompanyDto onet = new CompanyDto("Onet");
        CompanyDto wp = new CompanyDto("WP");
        CompanyDto wPolsce = new CompanyDto("WPolsce");
        CompanyDto netnews = new CompanyDto("netNews");

        EmployeeDto johnNowalski = new EmployeeDto("John", "Nowalski");
        EmployeeDto janKowalski = new EmployeeDto("Jan", "Kowalski");
        EmployeeDto janeDoes = new EmployeeDto("Jane", "Does");
        EmployeeDto billGates = new EmployeeDto("Bill", "Gates");

        onet.getEmployees().add(johnNowalski);
        onet.getEmployees().add(billGates);
        wp.getEmployees().add(janeDoes);
        wPolsce.getEmployees().add(janKowalski);
        netnews.getEmployees().add(billGates);

        johnNowalski.getCompanies().add(onet);
        billGates.getCompanies().add(onet);
        billGates.getCompanies().add(netnews);
        janeDoes.getCompanies().add(wp);
        janKowalski.getCompanies().add(wPolsce);

        manyToManyFacade.saveCompany(onet);
        manyToManyFacade.saveCompany(wp);
        manyToManyFacade.saveCompany(wPolsce);
        manyToManyFacade.saveCompany(netnews);

        manyToManyFacade.saveEmployee(johnNowalski);
        manyToManyFacade.saveEmployee(billGates);
        manyToManyFacade.saveEmployee(janeDoes);
        manyToManyFacade.saveEmployee(janKowalski);

        //When
        List<CompanyDto> companies = manyToManyFacade.findCompanies("WP");
        List<EmployeeDto> employees = manyToManyFacade.findEmployee("ski");
        //Then
        assertEquals(2, companies.size());
        assertEquals(2, employees.size());
        //CleanUp

    }


}
