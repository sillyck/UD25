package T25.Ej1.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import T25.Ej1.dto.Articulos;
import T25.Ej1.dto.Fabricantes;

public interface IArticulosDAO extends JpaRepository<Articulos, Long> {

	public List<Articulos> findByFabricante(Fabricantes fabricante);
}
