package com.example.amapola_project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "CarritoCompra")
public class CarritoCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Usuario comprador;
    @OneToMany
    @JsonIgnore
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
