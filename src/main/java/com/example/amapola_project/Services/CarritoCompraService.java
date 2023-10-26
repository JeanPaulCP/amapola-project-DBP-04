package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.CarritoCompra;
import com.example.amapola_project.Entities.Usuario;
import com.example.amapola_project.Repositories.CarritoCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.amapola_project.Entities.Producto;
import com.example.amapola_project.Repositories.ProductoRepository;
import java.util.List;

@Service
public class CarritoCompraService {

    @Autowired
    private CarritoCompraRepository carritoCompraRepository;
    public Iterable<CarritoCompra> getAllUsuarios() {
        return carritoCompraRepository.findAll();
    }
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getProductosEnCarrito(Long id) {
        // Implementa la lógica para obtener los productos en el carrito de compra
        // Por ejemplo, puedes buscar en la base de datos los productos que están en el carrito con el ID proporcionado.
        return productoRepository.findByCarroCompraId(id);
    }
    public void createCarritoCompra(CarritoCompra carritoCompra) {
        carritoCompraRepository.save(carritoCompra);
    }

}