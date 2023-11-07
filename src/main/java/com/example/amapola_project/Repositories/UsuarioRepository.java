package com.example.amapola_project.Repositories;

import com.example.amapola_project.Entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.tags.form.SelectTag;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>
{

}