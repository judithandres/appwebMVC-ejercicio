package com.formacion.web.mvc.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.formacion.web.mvc.entity.Departamento;
import com.formacion.web.mvc.entity.Empleado;

public interface DepartamentoDao extends JpaRepository<Departamento, Long>{

	
	
}
