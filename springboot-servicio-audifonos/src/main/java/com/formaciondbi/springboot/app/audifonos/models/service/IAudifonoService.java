package com.formaciondbi.springboot.app.audifonos.models.service;

import java.util.List;

import com.formaciondbi.springboot.app.audifonos.models.entity.Audifono;

public interface IAudifonoService {

	public List<Audifono> findAll();
	public Audifono findById(Long id_audifono);
}
