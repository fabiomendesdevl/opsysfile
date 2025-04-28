package com.lmsystems.opsysfile.services;

import com.lmsystems.opsysfile.entities.Client;
import com.lmsystems.opsysfile.entities.Specialties;
import com.lmsystems.opsysfile.repositories.SpecialtiesRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpecialtiesService {

    @Autowired
    private SpecialtiesRepository repository;

    public List<Specialties> findAll(){
        List<Specialties> obj = repository.findAll();
        return obj;
    }

    public Specialties findById(Long id){
        Optional<Specialties> obj = repository.findById(id);
        return obj.get();
    }

    public void deleteById(Long id){
        repository.deleteById(id);
    }
}
