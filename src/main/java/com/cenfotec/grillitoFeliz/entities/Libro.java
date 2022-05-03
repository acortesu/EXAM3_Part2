package com.cenfotec.grillitoFeliz.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;

@Data
@EqualsAndHashCode
@Entity
public class Libro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "autor")
    private String autor;

    @Column(name = "genero")
    private String genero;

    @Column(name = "estado", nullable = false)
    private String estado;



}
