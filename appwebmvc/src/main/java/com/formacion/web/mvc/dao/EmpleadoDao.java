package com.formacion.web.mvc.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.formacion.web.mvc.entity.Empleado;

public interface EmpleadoDao extends JpaRepository<Empleado, Long>{

	
	
}
