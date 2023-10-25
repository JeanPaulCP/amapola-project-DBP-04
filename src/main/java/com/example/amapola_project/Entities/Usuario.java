package com.example.amapola_project.Entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String nombreUsuario;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private String direccion;
    private String telefonoNro;
    private String fotoUrl;

    // Constructors, getters, and setters
    public Usuario(){}

    public Usuario(String nombre,
                   String nombreUsuario,
                   String apellido,
                   String correoElectronico,
                   String contrasena,
                   String direccion,
                   String telefonoNro,
                   String fotoUrl){
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.contrasena = contrasena;
        this.direccion = direccion;
        this.telefonoNro = telefonoNro;
        this.fotoUrl = fotoUrl;
    }

}