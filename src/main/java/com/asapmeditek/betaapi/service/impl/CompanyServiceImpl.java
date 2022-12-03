package com.asapmeditek.betaapi.service.impl;

import com.asapmeditek.betaapi.dto.ResponseModel;
import com.asapmeditek.betaapi.dto.request.AddCompanyRequestDto;
import com.asapmeditek.betaapi.entities.Company;
import com.asapmeditek.betaapi.repository.CompanyRepository;
import com.asapmeditek.betaapi.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyServiceImpl implements CompanyService {
    @Autowired
private CompanyRepository companyRepository;

    @Override
    public ResponseModel addCompany(AddCompanyRequestDto addCompanyRequestDto) {
        ResponseModel responseModel = new ResponseModel();
        Company company= new Company();
        company.setAvatar(addCompanyRequestDto.getAvatar());
        company.setName(addCompanyRequestDto.getName());
        company.setCity(addCompanyRequestDto.getCity());
        ///
        company.setEmail(addCompanyRequestDto.getEmail());
        company.setCountry(addCompanyRequestDto.getCountry());
        company.setCurrency(addCompanyRequestDto.getCurrency());
        company.setState(addCompanyRequestDto.getState());
        company.setHasAcceptedMarketing(addCompanyRequestDto.getHasAcceptedMarketing());
        company.setIsProspect(addCompanyRequestDto.getIsProspect());
        company.setIsReturning(addCompanyRequestDto.getIsReturning());
        company.setTotalAmountSpent(addCompanyRequestDto.getTotalAmountSpent());
        company.setTotalOrder(addCompanyRequestDto.getTotalOrder());
        Company savedCompany = companyRepository.save(company);
        responseModel.setData(savedCompany);
        responseModel.setStatus(200);
        responseModel.setMessage("Company saved successfully");
        return responseModel;
    }
}
