package com.formacion.web.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacion.web.mvc.dao.DepartamentoDao;
import com.formacion.web.mvc.dao.EmpleadoDao;
import com.formacion.web.mvc.entity.Departamento;
import com.formacion.web.mvc.entity.Empleado;

@Service
public class DepartamentoServiceImpl implements DepartamentoService{

	@Autowired
	private DepartamentoDao departamentoDao;

	@Override
	public List<Departamento> listarTodosLosDepartamentos() {
		return departamentoDao.findAll();
	}

	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return departamentoDao.save(departamento);
	}

	@Override
	public Departamento obtenerDepartamentoPorId(Long id) {
		return departamentoDao.findById(id).get();
	}

	@Override
	public void eliminarDepartamento(Long id) {
		departamentoDao.deleteById(id);
		
	}
	
}
