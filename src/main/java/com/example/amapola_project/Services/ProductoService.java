package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired // Inyecta el repositorio para poder utilizarlo
    private ProductoRepository productoRepository;

    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }
    public List<Producto> getAllProductsAvailables()
    {
        return productoRepository.findAllByDisponible(true);
    }
    public Optional<Producto> getProductById(Long id)
    {
        return productoRepository.findById(id);
    }
    public void createProducto(Producto producto)
    {
        productoRepository.save(producto);
    }

}