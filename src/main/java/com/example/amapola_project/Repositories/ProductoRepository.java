package com.example.amapola_project.Repositories;

import com.example.amapola_project.Entities.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
    List<Producto> findByVendedorId(Long id);
    List<Producto> findAllByDisponible(boolean disponible); // Esta es una función que se genera automáticamente
    // porque se llama findAllBy{Nombre del atributo}. Lo que hace esta función es buscar todos los productos
    // que tengan el atributo disponible en true.

    List<Producto> findByCarroCompraId(Long id);
}