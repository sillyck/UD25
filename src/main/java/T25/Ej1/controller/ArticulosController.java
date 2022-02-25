package T25.Ej1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import T25.Ej1.dto.Articulos;
import T25.Ej1.dto.Fabricantes;
import T25.Ej1.service.ArticulosServiceImpl;

/**
 * 
 * @author JOAN
 *
 */
@RestController
@RequestMapping("/api")
public class ArticulosController {

	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	@GetMapping("/articulos")
	public List<Articulos> listarArticulos()
	{
		return articulosServiceImpl.listarArticulos();
	}
	
	@PostMapping("/articulos")
	public Articulos salvarEmpleado(@RequestBody Articulos articulos)
	{
		return articulosServiceImpl.guardarArticulos(articulos);
	}

	
	@GetMapping("/articulos/fabricante/{fabricante}")
	public List<Articulos> listarEmpleadosTrabajo(@PathVariable(name="fabricante") Long id)
	{
		Fabricantes fabricante = new Fabricantes();
		
		fabricante.setId(id);
		
		return articulosServiceImpl.listarArticulosFabricantes(fabricante);
	}
	
	@GetMapping("/articulos/{id}")
	public Articulos empleadoXID(@PathVariable(name="id") Long id, @RequestBody Articulos articulos)
	{
		Articulos articulos_xid = new Articulos();
		
		articulos_xid = articulosServiceImpl.articulosXID(id);
		
		System.out.println("Articulo XID: " + articulos_xid);
		
		return articulos_xid;
	}
	
	@PutMapping("/articulos/{id}")
	public Articulos actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Articulos articulos)
	{
		Articulos articulos_seleccionado = new Articulos();
		Articulos articulos_actualizado = new Articulos();
		
		articulos_seleccionado = articulosServiceImpl.articulosXID(id);
		
		articulos_seleccionado.setNombre(articulos.getNombre());
		
		articulos_actualizado = articulosServiceImpl.actualizarArticulos(articulos_seleccionado);
		
		System.out.println("El articulo actualizado es: " + articulos_actualizado);
		
		return articulos_actualizado;
	}
	
	@DeleteMapping("/articulos/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") Long id)
	{
		articulosServiceImpl.eliminarArticulos(id);
	}
}
