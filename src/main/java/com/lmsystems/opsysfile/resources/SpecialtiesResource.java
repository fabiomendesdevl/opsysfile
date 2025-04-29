package com.lmsystems.opsysfile.resources;


import com.lmsystems.opsysfile.entities.Specialties;
import com.lmsystems.opsysfile.services.SpecialtiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.NoSuchElementException;

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

    @GetMapping(value = "/{id}")
    public ResponseEntity<Specialties> findById(@PathVariable Long id){
            Specialties obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id){
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PostMapping
    public ResponseEntity<Specialties> insertSpecialties(@RequestBody Specialties specialties){
        service.insertSpecialties(specialties);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(specialties.getId()).toUri();
        return ResponseEntity.created(uri).body(specialties);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Specialties> updateSpecialties(@PathVariable Long id, @RequestBody Specialties specialties){
        service.updateSpeacialties(id, specialties);
        return ResponseEntity.ok().body(specialties);
    }
}
