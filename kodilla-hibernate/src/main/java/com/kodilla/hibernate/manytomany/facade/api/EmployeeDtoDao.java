package com.kodilla.hibernate.manytomany.facade.api;


import com.kodilla.hibernate.manytomany.facade.EmployeeDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public interface EmployeeDtoDao extends CrudRepository<EmployeeDto, Integer> {

    @Query
    List<EmployeeDto> findEmployeeByLastnameContains(String name);
}
