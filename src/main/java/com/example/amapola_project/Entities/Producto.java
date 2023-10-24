package com.example.amapola_project.Entities;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "producto")
public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String fotoUrl;
    private double precio;
    private String condicion;
    private String categoria;
    private String ubicacion;
    private Date fechaPublicacion;
    private String nombreVendedor;

//    @ManyToOne
//    @JoinColumn(name = "usuario_id")
//    private Usuario usuario;

    // Constructores
    public Producto(){}

    public Producto(String nombre,
                    String descripcion,
                    String fotoUrl,
                    double precio,
                    String condicion,
                    String categoria,
                    String ubicacion,
                    Date fechaPublicacion,
                    String nombreVendedor){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotoUrl = fotoUrl;
        this.precio = precio;
        this.condicion = condicion;
        this.categoria = categoria;
        this.ubicacion = ubicacion;
        this.fechaPublicacion = fechaPublicacion;
        this.nombreVendedor = nombreVendedor;
    }
}
