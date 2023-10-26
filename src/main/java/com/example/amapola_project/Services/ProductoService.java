package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired // Inyecta el repositorio para poder utilizarlo
    private ProductoRepository productoRepository;

    public Iterable<Producto> getAllProducto() {
        return productoRepository.findAll();
    }
    public List<Producto> getAllProductosDisponibles() {
        return productoRepository.findAllByDisponible(true);
    }
    public Producto getProductoById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
    public void createProducto(Producto producto) {
        productoRepository.save(producto);
    }

}