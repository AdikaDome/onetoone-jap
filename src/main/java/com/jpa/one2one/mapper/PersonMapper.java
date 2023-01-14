package com.jpa.one2one.mapper;

import com.jpa.one2one.entity.AddressEntity;
import com.jpa.one2one.entity.PersonEntity;
import com.jpa.one2one.model.Address;
import com.jpa.one2one.model.Person;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity modelToEntity(Person person);
    Person entityToModel(PersonEntity personEntity);
    AddressEntity modelToEntity(Address address);

    Address entityToModel(AddressEntity addressEntity);


}
