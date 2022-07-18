package com.backend.springboot.app.estudiante.models.service;


import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;
import com.backend.springboot.app.estudiante.models.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService{

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Estudiante> findAll() {
        return (List<Estudiante>) estudianteRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Estudiante findById(Long id) {
        return estudianteRepository.findById( id ).orElse(null);
    }
}
