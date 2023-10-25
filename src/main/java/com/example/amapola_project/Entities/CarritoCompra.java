package com.example.amapola_project.Entities;

import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "CarritoCompra")
public class CarritoCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinTable(
            name = "ComprasRealizadas",
            joinColumns = @JoinColumn(name = "carro_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
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
