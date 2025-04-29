package com.lmsystems.opsysfile.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "tb_specialties")
public class Specialties implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameSpecialties;
    @Column(nullable = false)
    private Date Date;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client clientList;
}
