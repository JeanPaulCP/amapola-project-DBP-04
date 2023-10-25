package com.example.amapola_project.Repositories;

import com.example.amapola_project.Entities.CarritoCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarritoCompraRepository extends JpaRepository<CarritoCompra, Long> {
    // Puedes agregar consultas específicas si es necesario
}