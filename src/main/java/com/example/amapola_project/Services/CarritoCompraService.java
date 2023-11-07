package com.example.amapola_project.Services;

import com.example.amapola_project.Entities.CarritoCompra;
import com.example.amapola_project.Repositories.CarritoCompraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarritoCompraService {

    @Autowired
    private CarritoCompraRepository carritoCompraRepository;

    public List<CarritoCompra> getAllCarts()
    {
        return carritoCompraRepository.findAll();
    }

    public Optional<CarritoCompra> getCartById(Long id)
    {
        return carritoCompraRepository.findById(id);
    }

    public void createCarritoCompra(CarritoCompra carritoCompra)
    {
        carritoCompraRepository.save(carritoCompra);
    }

}