package com.learn.spring.project.springbootapp.controller;

import com.learn.spring.project.springbootapp.models.Parts;
import com.learn.spring.project.springbootapp.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")

public class PartsController {

    @Autowired
    PartsService service;

    @PostMapping("/parts")
    public void createParts(@RequestBody Parts parts) {
        service.saveParts(parts);

    }
    @GetMapping("/allParts")
    public List<Parts> getAllParts(){
       return service.getParts();
    }

    @GetMapping("/Part/{id}")
    public Optional<Parts> getPartById(@PathVariable int id)
    {
        return service.getPartsByID(id);
    }
    }



