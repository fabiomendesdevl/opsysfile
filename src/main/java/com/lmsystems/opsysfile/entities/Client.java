package com.lmsystems.opsysfile.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name = "tb_cliente")
public class Client implements Serializable {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String email;
    @Column(nullable = false)
    private Date brithDate;
    @Column(nullable = false)
    private String cpf;
    @Column(nullable = false)
    private String nameMother;
    @Column(nullable = false)
    private String street;
    @Column(nullable = false)
    private String neighborhood;
    @Column(nullable = false)
    private Integer number;
    @Column(nullable = false)
    private String phone;

    @OneToMany
    private List<Specialties> specialtiesList = new ArrayList<>();
}
