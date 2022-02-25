package T25.Ej1.dto;

import java.util.List;

import javax.persistence.*;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="fabricantes")
public class Fabricantes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Nombre")
	private String nombre;

	@OneToMany
    @JoinColumn(name="id")
    private List<Articulos> articulos;

	public Fabricantes() {
	}

	public Fabricantes(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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

	public List<Articulos> getArticulos() {
		return articulos;
	}

	public void setArticulos(List<Articulos> articulos) {
		this.articulos = articulos;
	}

	@Override
	public String toString() {
		return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
	}
}
