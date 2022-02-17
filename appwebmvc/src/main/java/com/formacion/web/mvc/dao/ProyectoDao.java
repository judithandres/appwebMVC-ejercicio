package com.formacion.web.mvc.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.formacion.web.mvc.entity.Empleado;
import com.formacion.web.mvc.entity.Proyecto;

public interface ProyectoDao extends JpaRepository<Proyecto, Long>{

	
	
}
