package com.lmsystems.opsysfile.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@Entity
@Table(name = "tb_specialties")
public class specialties {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nameSpecialties;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Date Date;
}
