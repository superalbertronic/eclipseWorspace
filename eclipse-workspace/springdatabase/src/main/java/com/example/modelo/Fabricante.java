package com.example.modelo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("fabricante")
public class Fabricante {

    @Id
    private Long id;
    private String nombre;

   
    public Fabricante() {
    }

    public Fabricante(Long id, String nombre) {
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

	// Getters y setters
    // toString() para mostrar los datos de manera legible
    @Override
    public String toString() {
        return "Fabricante{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
