package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Services.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductoController {

    @Autowired
    private ProductoService productoService;

    @GetMapping("/")
    public List<Producto> getAllProductosDisponibles() {
        return productoService.getAllProductosDisponibles();
    }

    @GetMapping("/{id}")
    public Producto getProducto(@PathVariable Long id) {
        return productoService.getProductoById(id);
    }
}