package UD25_Ej3.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import UD25_Ej3.dto.Cajas;

public interface ICajasDAO extends JpaRepository<Cajas, String>{
	
	public List<Cajas> findByAlmacen(String almacen);
	
}