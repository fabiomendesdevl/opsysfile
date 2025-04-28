package com.lmsystems.opsysfile.repositories;

import com.lmsystems.opsysfile.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
