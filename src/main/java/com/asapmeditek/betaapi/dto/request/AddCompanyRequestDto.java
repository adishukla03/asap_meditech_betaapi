package com.asapmeditek.betaapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCompanyRequestDto {
        private String avatar;
        private String name;
        private String city;
        private String country;
        private Double currency;
        private String email;
        private String state;
        private Boolean hasAcceptedMarketing;
        private Boolean isProspect;
        private Boolean isReturning;
        private Double totalAmountSpent;
        private Integer totalOrder;
    }


