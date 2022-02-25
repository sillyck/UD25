package UD25_Ej3.dto;

import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "almacenes")
public class Almacenes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "Nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "Capacidad") // no hace falta si se llama igual
	private int capacidad;

	@OneToMany
	@JoinColumn(name = "id")
	private List<Cajas> cajas;

	public Almacenes() {

	}

	public Almacenes(Long id, String nombre, int capacidad) {
		this.id = id;
		this.nombre = nombre;
		this.capacidad = capacidad;
	}

	public Long getid() {
		return id;
	}

	public void setid(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacenes [id=" + id + ", nombre=" + nombre + ", capacidad=" + capacidad + "]";
	}

}
