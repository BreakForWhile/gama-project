package com.breakforwhile.breakforwhile.controller.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeRestController {

    @GetMapping({"/home", "/"})
    public ResponseEntity<String[]> home(){
        String[] retorno = {"Hello", "World", "Break", "For", "While"};
        return new ResponseEntity<String[]>(retorno, HttpStatus.OK);
    }

}
