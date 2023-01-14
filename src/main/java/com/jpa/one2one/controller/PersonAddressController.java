package com.jpa.one2one.controller;

import com.jpa.one2one.model.Person;
import com.jpa.one2one.model.PersonResponse;
import com.jpa.one2one.service.PersonAddressService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Log4j2
public class PersonAddressController {
    @Autowired
    private PersonAddressService personAddressService;

@PostMapping(value = "/persons",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PersonResponse> createPerson(@RequestBody Person person){
    PersonResponse personResponse = personAddressService.createPerson(person);
    return new ResponseEntity<>(personResponse , HttpStatus.OK);

}
   @GetMapping(path = "/persons/{personId}",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Person> getById(@PathVariable Long personId){
    Person person = personAddressService.getById(personId);
    return new ResponseEntity<>(person ,HttpStatus.OK);

   }
}

