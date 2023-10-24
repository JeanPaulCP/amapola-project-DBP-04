package com.example.amapola_project.Entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "carritoCompra")
public class CarritoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Usuario comprador;
    @ManyToMany
    private Set<Producto> productos;
    private int cantidad;
    private double precioTotal;

    // Constructores
    public CarritoCompra() {
    }
    public CarritoCompra(Usuario comprador,
                         Set<Producto> productos,
                         int cantidad,
                         double precioTotal){
        this.comprador = comprador;
        this.productos = productos;
        this.cantidad = cantidad;
        this.precioTotal = precioTotal;
    }
}
