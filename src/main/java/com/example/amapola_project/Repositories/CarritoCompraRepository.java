package com.example.amapola_project.Repositories;

import com.example.amapola_project.Entities.CarritoCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import com.example.amapola_project.Entities.Producto;

@Repository
public interface CarritoCompraRepository extends JpaRepository<CarritoCompra, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
    List<Producto> findByCarroCompraId(Long id);
}