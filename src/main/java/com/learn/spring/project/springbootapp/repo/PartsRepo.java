package com.learn.spring.project.springbootapp.repo;

import com.learn.spring.project.springbootapp.models.Parts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface PartsRepo extends JpaRepository<Parts, Integer> {
}
