package com.backend.springboot.app.estudiante.controllers;


import com.backend.springboot.app.commons.beneficiarios.models.entity.Estudiante;
import com.backend.springboot.app.estudiante.models.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    @GetMapping("/listar")
    public ResponseEntity<?> listar() {

        HashMap<String, Object> result = new HashMap<>();
        result.put("success", true);
        result.put("message", "Consulta correcta");
        result.put("data", estudianteService.findAll());

        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalle(@PathVariable Long id) throws InterruptedException{

        HashMap<String, Object> result = new HashMap<>();
        Estudiante data = estudianteService.findById(id);
        if (data == null) {
            result.put("success", false);
            result.put("message", "No existe Estudiante con Id: " + id);
            return new ResponseEntity<>(result, HttpStatus.NOT_FOUND);
        }
        result.put("success", true);
        result.put("message", "Se ha encontrado el registro.");
        result.put("data", data);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
