package com.example.amapola_project.Controllers;

import com.example.amapola_project.Services.CarritoCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.amapola_project.Entities.Producto;
import java.util.List;

@RestController
@RequestMapping("/carts")
public class CarritoCompraController {

    @Autowired
    private CarritoCompraService carritoCompraService;

    @GetMapping("/{id}/products")
    public List<Producto> getProductosEnCarrito(@PathVariable Long id) {
        return carritoCompraService.getProductosEnCarrito(id);
    }
}