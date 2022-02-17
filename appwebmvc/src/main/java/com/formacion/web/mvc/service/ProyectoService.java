package com.formacion.web.mvc.service;
import java.util.List;


import com.formacion.web.mvc.entity.Empleado;
import com.formacion.web.mvc.entity.Proyecto;

public interface ProyectoService {

	public List<Proyecto> listarTodosLosProyectos();
	
	public Proyecto guardarProyecto(Proyecto proyecto);
	
	public Proyecto obtenerProyectoPorId(Long id);
	
	public void eliminarProyecto(Long id);
}
