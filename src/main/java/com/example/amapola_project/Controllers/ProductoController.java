package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**

 Endpoints:

 /users/{id_u} -> Se obtiene el perfil del usuario
 /products/availables -> Se obtienen todos los productos disponibles
 /products/availables/{id_p} -> Se obtiene un producto específico
 /users/products/{id_u}/purchased -> Se obtienen todos los productos comprados por el usuario
 /users/products/{id_u}/sold -> Se obtienen todos las ventas pendientes del usuario

 */

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductoService productoService;
    @GetMapping("/") // Se obtienen todos los usuarios
    public List<Producto> getAllProductos()
    {
        return productoService.getAllProducts();
    }
    @GetMapping("/availables") // Se obtienen todos los productos disponibles
    public List<Producto> getAllProductosDisponibles()
    {
        return productoService.getAllProductsAvailables();
    }
    @GetMapping("/{id}") // Se obtiene un producto específico
    public ResponseEntity<Producto> getProductoByID(@PathVariable Long id)
    {
        Optional<Producto> product = productoService.getProductById(id);
        return product.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }
    @PostMapping("/") // Se crea un producto
    public String createProducto(@RequestBody Producto producto) {
        productoService.createProducto(producto);
        return "Producto creado";
    }

}