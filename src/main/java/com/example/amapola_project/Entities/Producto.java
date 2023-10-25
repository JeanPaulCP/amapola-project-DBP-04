package com.example.amapola_project.Entities;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import jakarta.persistence.*;

@Entity
@Table(name = "Producto")
public class Producto{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String fotoUrl;
    private double precio;
    private Date fechaPublicacion;
    @ManyToOne
    @JoinTable(
            name = "usuarioVentaProducto",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "usuario_id"))
    private Usuario vendedor;
    @ManyToOne
    @JoinTable(
            name = "carro_producto",
            joinColumns = @JoinColumn(name = "producto_id"),
            inverseJoinColumns = @JoinColumn(name = "carro_id")
              )
    private CarritoCompra carroCompra;
    private Boolean disponible; // Avisa si esta disponible para la venta o ya no
    // Constructores
    public Producto(){}
    public Producto(Long id,
                    String nombre,
                    String descripcion,
                    String fotoUrl,
                    double precio,
                    Date fechaPublicacion,
                    Usuario vendedor,
                    CarritoCompra carroCompra,
                    Boolean disponible){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fotoUrl = fotoUrl;
        this.precio = precio;
        this.fechaPublicacion = fechaPublicacion;
        this.vendedor = vendedor;
        this.carroCompra = carroCompra;
        this.disponible = disponible;
    }
    // Getters
    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFotoUrl() {
        return fotoUrl;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public Usuario getVendedor() {
        return vendedor;
    }

    public CarritoCompra getCarroCompra() {
        return carroCompra;
    }
    public Boolean getDisponible() {
        return disponible;
    }
    // Setters
    public void setId(Long id) {
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setFotoUrl(String fotoUrl) {
        this.fotoUrl = fotoUrl;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }
    public void setVendedor(Usuario vendedor) {
        this.vendedor = vendedor;
    }
    public void setCarroCompra(CarritoCompra carroCompra) {
        this.carroCompra = carroCompra;
    }
    public void setDisponible(Boolean disponible) {
        this.disponible = disponible;
    }
}