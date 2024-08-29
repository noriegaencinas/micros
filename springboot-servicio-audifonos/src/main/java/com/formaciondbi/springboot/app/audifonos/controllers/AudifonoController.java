package com.formaciondbi.springboot.app.audifonos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.audifonos.models.entity.Audifono;
import com.formaciondbi.springboot.app.audifonos.models.service.IAudifonoService;

@RestController
public class AudifonoController {

	@Autowired
	private IAudifonoService audifonoService;
	
	@GetMapping("/listar")
	public List<Audifono> listar() {
		return audifonoService.findAll();
	}
	
	@GetMapping("/listar/{id}")
	public Audifono detalle(@PathVariable Long id_audifono) {
		return audifonoService.findById(id_audifono);
	}
}
