package com.backend.springboot.app.estudiante.models.repository;

import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;
import org.springframework.data.repository.CrudRepository;

public interface EstudianteRepository extends CrudRepository<Estudiante, Long > {
}
