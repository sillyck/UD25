package T25.Ej1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import T25.Ej1.dto.Fabricantes;


/**
 * 
 * @author JOAN
 *
 */
public interface IFabricantesDAO extends JpaRepository<Fabricantes, Long>  {

}
