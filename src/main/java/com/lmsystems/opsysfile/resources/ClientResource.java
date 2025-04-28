package com.lmsystems.opsysfile.resources;

import com.lmsystems.opsysfile.entities.Client;
import com.lmsystems.opsysfile.services.ClientService;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<Client>> findAll(){
        List<Client> obj = service.findAll();
        return ResponseEntity.ok().body(obj);
    }
}
