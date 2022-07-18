package com.backend.springboot.app.estudiante.models.service;


import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;

import java.util.List;

public interface IEstudianteService {

    public List<Estudiante> findAll();
    public Estudiante findById(Long id);

}
