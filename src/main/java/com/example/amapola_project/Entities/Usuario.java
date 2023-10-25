package com.example.amapola_project.Entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long dni;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String password;
    private String region;
    private String provincia;
    private String distrito;
    private String fotoUrl;
    private String telefonoNro;
    @OneToOne
    private CarritoCompra carroUser;
    @OneToMany
    private Set<Producto> productosVendidos;

    // Constructores, getters, y setters
    public Usuario(){}

    public Usuario(Long id,
                   Long dni,
                   String nombre,
                   String apellido,
                   String correoElectronico,
                   String password,
                   String region,
                   String provincia,
                   String distrito,
                   String fotoUrl,
                   String telefonoNro,
                   CarritoCompra carroUser,
                   Set<Producto> productosVendidos) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.password = password;
        this.region = region;
        this.provincia = provincia;
        this.distrito = distrito;
        this.fotoUrl = fotoUrl;
        this.telefonoNro = telefonoNro;
        this.carroUser = carroUser;
        this.productosVendidos = productosVendidos;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public Long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPassword() {
        return password;
    }

    public String getRegion() {
        return region;
    }

    public String getProvincia() {
        return provincia;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public String getTelefonoNro() {
        return telefonoNro;
    }

    public CarritoCompra getCarroUser() {
        return carroUser;
    }

    public Set<Producto> getProductosVendidos() {
        return productosVendidos;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }

    public void setTelefonoNro(String telefonoNro) {
        this.telefonoNro = telefonoNro;
    }

    public void setCarroUser(CarritoCompra carroUser) {
        this.carroUser = carroUser;
    }
    public void setProductosVendidos(Set<Producto> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }
}