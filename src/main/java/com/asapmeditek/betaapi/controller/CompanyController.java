package com.asapmeditek.betaapi.controller;

import com.asapmeditek.betaapi.dto.ResponseModel;
import com.asapmeditek.betaapi.dto.request.AddCompanyRequestDto;
import com.asapmeditek.betaapi.entities.Company;
import com.asapmeditek.betaapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/company")
    public ResponseEntity<ResponseModel> saveCompany(
             @RequestBody AddCompanyRequestDto addCompanyRequestDto)
    {

        return ResponseEntity.status(HttpStatus.OK).body(companyService.addCompany(addCompanyRequestDto)) ;
    }

}
