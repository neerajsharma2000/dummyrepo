package com.project.dummy.models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "dummy")
public class Dummy {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;
}
