package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

import static org.springframework.data.repository.query.parser.Part.Type.LIKE;


@Transactional
@Repository
public interface CompanyDao extends CrudRepository<Company,Integer> {

    @Query(nativeQuery = true)
    List<Company> retrieveCompaniesWithString(@Param("COMPANY_NAME") String Keyword);

    @Query
    List<Company> findCompaniesByNameContains(String name);
}
