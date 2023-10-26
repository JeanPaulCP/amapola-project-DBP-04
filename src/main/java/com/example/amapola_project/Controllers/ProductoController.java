package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**

 Endpoints:

 /users/{id_u} -> Se obtiene el perfil del usuario
 /products/ -> Se obtienen todos los productos disponibles
 /products/{id_p} -> Se obtiene un producto específico
 /users/products/{id_u}/purchased -> Se obtienen todos los productos comprados por el usuario
 /users/products/{id_u}/sold -> Se obtienen todos las ventas pendientes del usuario

 */

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @GetMapping("/") // Se obtienen todos los productos disponibles
    public List<Producto> getAllProductosDisponibles() {
        return productoService.getAllProductosDisponibles();
    }
    @GetMapping("/{id}") // Se obtiene un producto específico
    public Producto getProducto(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }
    @PostMapping("/") // Se crea un producto
    public Producto createProducto(@RequestBody Producto producto) {
        return productoService.createProducto(producto);
    }

}