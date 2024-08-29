package com.formaciondbi.springboot.app.audifonos.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.formaciondbi.springboot.app.audifonos.models.entity.Audifono;
import com.formaciondbi.springboot.app.audifonos.models.entity.dao.AudifonoDao;

@Service
public class AudifonoServiceImpl implements IAudifonoService {

	@Autowired
	private AudifonoDao audifonoDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Audifono> findAll() {
		return (List <Audifono>) audifonoDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Audifono findById(Long id_audifono) {
		return audifonoDao.findById(id_audifono).orElse(null);
	}

	
}
