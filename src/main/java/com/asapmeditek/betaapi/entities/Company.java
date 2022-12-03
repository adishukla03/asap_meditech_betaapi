package com.asapmeditek.betaapi.entities;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "company")
@Data
@NoArgsConstructor
@AllArgsConstructor
 public class Company {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id")
   private Long id;
    private String avatar;
   @Column(name = "name")
    private String name;
   @Column(name = "city")
    private String city;
   @Column(name = "country")
    private String country;
   @Column(name = "currency")
    private Double currency;
   @Column(name = "email")
    private String email;
   @Column(name = "state")
    private String state;
    private Boolean hasAcceptedMarketing;
    private Boolean isProspect;
    private Boolean isReturning;
    private Double totalAmountSpent;
    private Integer totalOrder;
}
