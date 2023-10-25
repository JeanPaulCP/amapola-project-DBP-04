package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getAllProductosDisponibles() {
        // Implementa la lógica para obtener todos los productos disponibles
        // Por ejemplo, puedes buscar en la base de datos los productos que están marcados como disponibles.
        return productoRepository.findAllByDisponible(true);
    }

    public Producto getProductoById(Long id) {
        return productoRepository.findById(id).orElse(null);
    }
}