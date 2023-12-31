package com.example.amapola_project.Entities;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "Usuario")
public class Usuario{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
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
    @OneToMany
    @JsonIgnore // Para evitar que se cree un loop infinito
    private Set<CarritoCompra> carritos;
    @OneToMany
    @JsonIgnore // Cuando se haga un post de usuario, no será necesario que se envíen los productos que vende
    private Set<Producto> productosPorVender;

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
                   Set<CarritoCompra> carritos,
                   Set<Producto> productosPorVender) {
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
        this.carritos = carritos;
        this.productosPorVender=productosPorVender;
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

    public Set<CarritoCompra> getCarritos() {
        return carritos;
    }

    public Set<Producto> getProductosPorVender() {
        return productosPorVender;
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

    public void setCarritos(Set<CarritoCompra> carritos) {
        this.carritos = carritos;
    }
    public void setProductosPorVender(Set<Producto> productosPorVender) {
        this.productosPorVender = productosPorVender;
    }
}