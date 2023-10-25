package com.example.amapola_project.Entities;

import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "CarritoCompra")
public class CarritoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Usuario comprador;
    @OneToMany
    private Set<Producto> productos;

    // Constructores
    public CarritoCompra() {
    }
    public CarritoCompra(Long id,
                         Usuario comprador,
                         Set<Producto> productos) {
        this.id = id;
        this.comprador = comprador;
        this.productos = productos;
    }
    // Getters
    public Long getId() {
        return id;
    }
    public Usuario getComprador() {
        return comprador;
    }
    public Set<Producto> getProductos() {
        return productos;
    }
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setComprador(Usuario comprador) {
        this.comprador = comprador;
    }
    public void setProductos(Set<Producto> productos) {
        this.productos = productos;
    }
}
