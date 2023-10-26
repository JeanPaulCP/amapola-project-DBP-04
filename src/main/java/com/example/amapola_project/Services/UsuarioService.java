package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.CarritoCompra;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amapola_project.Entities.Producto;

import java.util.Objects;
import java.util.Set;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Iterable<Usuario> getAllUsuarios() {
        return usuarioRepository.findAll();
    }
    public Usuario getUsuarioById(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }

    public Set<CarritoCompra> getCarritosByUsuario(Long id){
        return Objects.requireNonNull(usuarioRepository.findById(id).orElse(null)).getCarritos();
    }

    public Set<Producto> getVentasPendientes(Long id){
        return Objects.requireNonNull(usuarioRepository.findById(id).orElse(null)).getProductosPorVender();
    }

    // Función para crear a un nuevo usuario
    public void createUsuario(Usuario usuario) {
        usuarioRepository.save(usuario);
    }
}