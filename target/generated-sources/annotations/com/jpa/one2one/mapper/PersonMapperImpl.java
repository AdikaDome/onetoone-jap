package com.jpa.one2one.mapper;

import com.jpa.one2one.entity.AddressEntity;
import com.jpa.one2one.entity.PersonEntity;
import com.jpa.one2one.model.Address;
import com.jpa.one2one.model.Person;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-29T09:17:32+0530",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.2 (Oracle Corporation)"
)
@Component
public class PersonMapperImpl implements PersonMapper {

    @Override
    public PersonEntity modelToEntity(Person person) {
        if ( person == null ) {
            return null;
        }

        PersonEntity personEntity = new PersonEntity();

        personEntity.setFirstName( person.getFirstName() );
        personEntity.setLastName( person.getLastName() );

        return personEntity;
    }

    @Override
    public Person entityToModel(PersonEntity personEntity) {
        if ( personEntity == null ) {
            return null;
        }

        Person person = new Person();

        person.setFirstName( personEntity.getFirstName() );
        person.setLastName( personEntity.getLastName() );

        return person;
    }

    @Override
    public AddressEntity modelToEntity(Address address) {
        if ( address == null ) {
            return null;
        }

        AddressEntity addressEntity = new AddressEntity();

        addressEntity.setAddress( address.getAddress() );
        addressEntity.setCity( address.getCity() );
        addressEntity.setZipCode( address.getZipCode() );

        return addressEntity;
    }

    @Override
    public Address entityToModel(AddressEntity addressEntity) {
        if ( addressEntity == null ) {
            return null;
        }

        Address address = new Address();

        address.setAddress( addressEntity.getAddress() );
        address.setCity( addressEntity.getCity() );
        address.setZipCode( addressEntity.getZipCode() );

        return address;
    }
}
