package com.learn.spring.project.springbootapp.service;

import com.learn.spring.project.springbootapp.models.Parts;
import com.learn.spring.project.springbootapp.repo.PartsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public Parts getPartsById(Integer Id){
        return repo.getById(Id);
    }

}
