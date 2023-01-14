package com.jpa.one2one.entity;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "address_entity")
public class AddressEntity {
    @Id
    @SequenceGenerator(name = "seq_address", sequenceName = "seq_address",initialValue = 1,allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_address")
    private Long addressId;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "zipCode")
    private String zipCode;

    @OneToOne(mappedBy = "addressEntity")
    private PersonEntity personEntity;
}
