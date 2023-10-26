package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Services.CarritoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.amapola_project.Entities.CarritoCompra;

@RestController
@RequestMapping("/carts")
public class CarritoCompraController {

    @Autowired
    private CarritoCompraService carritoCompraService;
    @GetMapping("/") // Se obtienen todos los usuarios
    public Iterable<CarritoCompra> getAllCarritos() {
        return carritoCompraService.getAllUsuarios();
    }
    @PostMapping("/") // Se crea un producto
    public String createProducto(@RequestBody CarritoCompra carritoCompra) {
        carritoCompraService.createCarritoCompra(carritoCompra);
        return "Carrito de compra creado";
    }
}