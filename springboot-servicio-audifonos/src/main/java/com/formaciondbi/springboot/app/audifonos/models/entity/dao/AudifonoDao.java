package com.formaciondbi.springboot.app.audifonos.models.entity.dao;

import org.springframework.data.repository.CrudRepository;

import com.formaciondbi.springboot.app.audifonos.models.entity.Audifono;

public interface AudifonoDao extends CrudRepository<Audifono, Long>{
	
}
