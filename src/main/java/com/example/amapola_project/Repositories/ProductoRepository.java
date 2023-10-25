package com.example.amapola_project.Repositories;

import com.example.amapola_project.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar consultas específicas si es necesario
}