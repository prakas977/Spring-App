package com.learn.spring.project.springbootapp.service;

import com.learn.spring.project.springbootapp.models.Parts;
import com.learn.spring.project.springbootapp.repo.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartsService {
    @Autowired
    private final PartsRepo repo;

    public PartsService(PartsRepo repo) {
        this.repo = repo;
    }

    public void saveParts(Parts part) {
        repo.save(part);
    }
    public List<Parts> getParts(){
       return repo.findAll();
    }

    public Optional<Parts> getPartsByID(int id){
        return repo.findById(id);
    }

}
