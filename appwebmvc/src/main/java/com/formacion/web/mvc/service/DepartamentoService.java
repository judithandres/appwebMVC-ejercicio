package com.formacion.web.mvc.service;
import java.util.List;

import com.formacion.web.mvc.entity.Departamento;


public interface DepartamentoService {

	public List<Departamento> listarTodosLosDepartamentos();
	
	public Departamento guardarDepartamento(Departamento departamento);
	
	public Departamento obtenerDepartamentoPorId(Long id);
	
	public void eliminarDepartamento(Long id);
}
