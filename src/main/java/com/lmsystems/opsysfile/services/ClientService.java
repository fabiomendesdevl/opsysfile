package com.lmsystems.opsysfile.services;

import com.lmsystems.opsysfile.entities.Client;
import com.lmsystems.opsysfile.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    public List<Client> findAll() {
        List<Client> obj = repository.findAll();
        return obj;
    }

    public Client findById(Long id) {
            Optional<Client> obj = repository.findById(id);
            return obj.get();
    }
}

