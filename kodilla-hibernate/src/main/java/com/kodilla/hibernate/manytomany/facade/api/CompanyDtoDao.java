package com.kodilla.hibernate.manytomany.facade.api;


import com.kodilla.hibernate.manytomany.facade.CompanyDto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


@Transactional
@Repository
public interface CompanyDtoDao extends CrudRepository<CompanyDto,Integer> {


    @Query
    List<CompanyDto> findCompaniesByNameContains(String name);
}
