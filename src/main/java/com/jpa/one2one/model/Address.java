package com.jpa.one2one.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String address;
    private String city;
    private String zipCode;
}
