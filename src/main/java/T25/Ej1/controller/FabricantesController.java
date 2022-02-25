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

import T25.Ej1.dto.Fabricantes;
import T25.Ej1.service.FabricantesServiceImpl;

/**
 * 
 * @author JOAN
 *
 */
@RestController
@RequestMapping("/api")
public class FabricantesController {

	@Autowired
	FabricantesServiceImpl fabricantesServiceImpl;
	
	@GetMapping("/fabricantes")
	public List<Fabricantes> listarFabricantes()
	{
		return fabricantesServiceImpl.listarFabricantes();
	}
	
	@PostMapping("/fabricantes")
	public Fabricantes salvarEmpleado(@RequestBody Fabricantes fabricantes)
	{
		return fabricantesServiceImpl.guardarFabricantes(fabricantes);
	}
	
	@GetMapping("/fabricantes/{id}")
	public Fabricantes empleadoXID(@PathVariable(name="id") Long id, @RequestBody Fabricantes fabricantes)
	{
		Fabricantes fabricantes_xid = new Fabricantes();
		
		fabricantes_xid = fabricantesServiceImpl.fabricantesXID(id);
		
		System.out.println("Fabricantes XID: " + fabricantes_xid);
		
		return fabricantes_xid;
	}
	
	@PutMapping("/fabricantes/{id}")
	public Fabricantes actualizarEmpleado(@PathVariable(name="id") Long id, @RequestBody Fabricantes fabricantes)
	{
		Fabricantes fabricantes_seleccionado = new Fabricantes();
		Fabricantes fabricantes_actualizado = new Fabricantes();
		
		fabricantes_seleccionado = fabricantesServiceImpl.fabricantesXID(id);
		
		fabricantes_seleccionado.setNombre(fabricantes.getNombre());
		
		fabricantes_actualizado = fabricantesServiceImpl.actualizarFabricantes(fabricantes_seleccionado);
		
		System.out.println("El fabricante actualizado es: " + fabricantes_actualizado);
		
		return fabricantes_actualizado;
	}
	
	@DeleteMapping("/fabricantes/{id}")
	public void eliminarEmpleado(@PathVariable(name="id") Long id)
	{
		fabricantesServiceImpl.eliminarFabricantes(id);
	}
}
