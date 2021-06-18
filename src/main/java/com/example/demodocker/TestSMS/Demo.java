package com.example.demodocker.TestSMS;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/ecm")
public class Demo {

    @GetMapping("/show")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }

    @PostMapping
    public ResponseEntity<?> get() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
