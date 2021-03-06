package com.cpe.backend.registercompany.controller;

import com.cpe.backend.registercompany.entity.Type;
import com.cpe.backend.registercompany.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class TypeController {

    @Autowired
    private final TypeRepository typeRepository;

    public TypeController(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @GetMapping("/type")
    public Collection<Type> Types() {
        return typeRepository.findAll().stream().collect(Collectors.toList());
    }

    @GetMapping("/type/{id}")
    public Optional<Type> CompanyTyps(@PathVariable Long id) {
        Optional<Type> type = typeRepository.findById(id);
        return type;
    }
}