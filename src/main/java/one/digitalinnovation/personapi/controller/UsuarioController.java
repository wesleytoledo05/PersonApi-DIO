package one.digitalinnovation.personapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovation.personapi.entities.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;

@RestController
@RequestMapping({ "/usuario" })
public class UsuarioController {

    @Autowired
    private PersonRepository personRepo;

  @PostMapping(consumes = { "application/json" })
  public ResponseEntity<Person> adicionaUsuario(@Valid @RequestBody Person person) {
    try {
      Person response = personRepo.save(person);

      return new ResponseEntity<>(response, HttpStatus.CREATED);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
    }
  }

  @GetMapping
  public ResponseEntity<List<Person>> listCarros() {

   try {
      List<Person> response = personRepo.findAll();

      return new ResponseEntity<>(response, HttpStatus.OK);
    } catch (Exception e) {
      throw new Error(e);
    }
  }




}