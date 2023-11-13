package com.example.amapola_project.Controllers;

import com.example.amapola_project.Entities.CarritoCompra;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import com.example.amapola_project.Entities.Producto;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/") // Se obtienen todos los usuarios
    public List<Usuario> getAllUsuarios()
    {
        return usuarioService.getAllUsuarios();
    }
    @GetMapping("/{id}") // Se obtiene el perfil del usuario
    public ResponseEntity<Usuario> getUsuario(@PathVariable Long id)
    {
        Optional<Usuario> usuarioOptional = usuarioService.getUsuarioById(id);

        return usuarioOptional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping("/products/{id}/purchased") // Se obtienen todos las compras realizadas por el usuario
    public Set<CarritoCompra> getComprasUsuario(@PathVariable Long id) {
        return usuarioService.getCarritosByUsuario(id);
    }

    @GetMapping("/products/{id}/sale") // Se obtienen todos las ventas pendientes del usuario
    public Set<Producto> getVentasPendientesPorUsuario(@PathVariable Long id) {
        return usuarioService.getVentasPendientes(id);
    }

    @PostMapping("/")
    public String createUsuario(@RequestBody Usuario usuario) {
        usuarioService.createUsuario(usuario);
        return "Usuario creado";
    }
}