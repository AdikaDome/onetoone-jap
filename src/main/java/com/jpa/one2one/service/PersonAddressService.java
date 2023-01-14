package com.jpa.one2one.service;

import com.jpa.one2one.entity.AddressEntity;
import com.jpa.one2one.entity.PersonEntity;
import com.jpa.one2one.mapper.PersonMapper;
import com.jpa.one2one.model.Address;
import com.jpa.one2one.model.Person;
import com.jpa.one2one.model.PersonResponse;
import com.jpa.one2one.repository.PersonRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Log4j2
public class PersonAddressService {
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;


    public PersonResponse createPerson(Person person) {
        PersonEntity personEntity = personMapper.modelToEntity(person);
        AddressEntity addressEntity=personMapper.modelToEntity(person.getAddress());
        personEntity.setAddressEntity(addressEntity);
        personRepository.save(personEntity);
        PersonResponse personResponse = new PersonResponse();
        personResponse.setPersonId(personEntity.getPersonId());
        log.info("person added" + personResponse);
        return personResponse;
    }
    public Person getById(Long personId)
    {
        Optional<PersonEntity> personEntity = personRepository.findById(personId);
        Person person = new Person();
        Address address=new Address();
        if (personEntity.isPresent())
        {
            person = personMapper.entityToModel(personEntity.get());
            address=personMapper.entityToModel(personEntity.get().getAddressEntity());
            person.setAddress(address);

            log.info("person find with id {}", personId);
        } else {
            log.info("cart with id {} not found", personId);
        }
        return person;

        }
    }

