package T25.Ej1.service;

import java.util.List;

import T25.Ej1.dto.Articulos;
import T25.Ej1.dto.Fabricantes;

/**
 * 
 * @author JOAN
 *
 */
public interface IArticulosService {
	
	public List<Articulos> listarArticulos();

	public Articulos guardarArticulos(Articulos articulos);
	
	public Articulos articulosXID(Long id);
	
	public List<Articulos> listarArticulosFabricantes(Fabricantes fabricante);
	
	public Articulos actualizarArticulos(Articulos articulos);
	
	public void eliminarArticulos(Long id);
}
