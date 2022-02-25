package UD25_Ej3.dto;

import javax.persistence.*;

@Entity
@Table(name = "cajas")
public class Cajas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private String id;
	@Column(name = "Contenido") // no hace falta si se llama igual
	private String contenido;
	@Column(name = "Valor") // no hace falta si se llama igual
	private int valor;
	@ManyToOne
	@JoinColumn(name = "Almacen") // no hace falta si se llama igual
	private Almacenes almacen;

	public Cajas() {

	}

	public Cajas(String id, String contenido, int valor, int almacen) {
		super();
		this.id = id;
		this.contenido = contenido;
		this.valor = valor;
	}

	public String getid() {
		return id;
	}

	public void setid(String id) {
		this.id = id;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}


	@Override
	public String toString() {
		return "Cajas [id=" + id + ", contenido=" + contenido + ", valor=" + valor + "]";
	}

}