package com.lmsystems.opsysfile.resources;


import com.lmsystems.opsysfile.entities.Specialties;
import com.lmsystems.opsysfile.services.SpecialtiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/specialties")
public class SpecialtiesResource {

    @Autowired
    private SpecialtiesService service;

    @GetMapping
    public ResponseEntity<List<Specialties>> findAll(){
        List<Specialties> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }
}
