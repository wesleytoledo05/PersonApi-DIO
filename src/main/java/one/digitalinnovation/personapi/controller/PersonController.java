package one.digitalinnovation.personapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dio/v1/personapi")
public class PersonController {
    @GetMapping
    public String GetBook(){
        return "TESTE!!!";
    }
}
