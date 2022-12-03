package com.asapmeditek.betaapi.service;

import com.asapmeditek.betaapi.dto.ResponseModel;
import com.asapmeditek.betaapi.dto.request.AddCompanyRequestDto;
import org.springframework.http.ResponseEntity;

public interface CompanyService {
    ResponseModel addCompany(AddCompanyRequestDto addCompanyRequestDto );
}
