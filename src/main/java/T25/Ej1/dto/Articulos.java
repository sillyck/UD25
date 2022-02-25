package T25.Ej1.dto;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="articulos")
public class Articulos {

	//Atributos empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Nombre")
	private String nombre;

	@Column(name="Precio")
	private int precio;

	@ManyToOne
    @JoinColumn(name="Fabricante")
    private Fabricantes fabricante;

	public Articulos() {
	}

	public Articulos(Long id, String nombre, int precio) {
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Fabricantes")
	public Fabricantes getFabricantes() {
		return fabricante;
	}

	public void setFabricantes(Fabricantes fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
