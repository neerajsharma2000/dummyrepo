package com.project.dummy.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "dummy")
public class Dummy {
    @Id
    @GeneratedValue
    private int id;
    @Column(name = "name")
    private String name;

}
