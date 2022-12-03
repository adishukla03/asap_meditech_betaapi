package com.asapmeditek.betaapi.repository;

import com.asapmeditek.betaapi.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {

}
