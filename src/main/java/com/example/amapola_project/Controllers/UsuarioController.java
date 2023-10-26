package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.CarritoCompra;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.amapola_project.Entities.Producto;
import java.util.Set;

/**

 Endpoints:

 /users/{id_u} -> Se obtiene el perfil del usuario
 /products/ -> Se obtienen todos los productos disponibles
 /products/{id_p} -> Se obtiene un producto específico
 /users/products/{id_u}/purchased -> Se obtienen todas las compras realizadas (carritos) por el usuario
 /users/products/{id_u}/sold -> Se obtienen todos las ventas pendientes del usuario

 */

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}") // Se obtiene el perfil del usuario
    public Usuario getUsuario(@PathVariable Long id) {
        return usuarioService.getUsuarioById(id);
    }

    @GetMapping("/products/{id}/purchased") // Se obtienen todos las compras realizadas por el usuario
    public Set<CarritoCompra> getComprasUsuario(@PathVariable Long id) {
        return usuarioService.getCarritosByUsuario(id);
    }

    @GetMapping("/products/{id}/sold") // Se obtienen todos las ventas pendientes del usuario
    public Set<Producto> getVentasPendientesPorUsuario(@PathVariable Long id) {
        return usuarioService.getVentasPendientes(id);
    }

    @PostMapping("/")
    public String createUsuario(@RequestBody Usuario usuario) {
        usuarioService.createUsuario(usuario);
        return "Usuario creado";
    }
}