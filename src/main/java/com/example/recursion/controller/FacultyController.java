package com.example.recursion.controller;

import com.example.recursion.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.recursion.service.FacultyService.*;

@RestController
public class FacultyController {

    @GetMapping("/faculty")
    public long faculty(int number) {
        return fac(number);
    }
}
