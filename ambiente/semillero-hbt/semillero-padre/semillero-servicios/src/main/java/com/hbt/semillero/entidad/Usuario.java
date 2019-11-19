/**
 * Usuario.java
 */
package com.hbt.semillero.entidad;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

public class Usuario {
	
	private Long id;
	private Long id_persona;
	private String nombre;
	/**
	 * Constructor de la clase.
	 */
	public Usuario() {
		super();
	}
	
	
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TCUSUARIO_SUID_GENERATOR", sequenceName = "SEQ_TCUSUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TCUSUARIO_SUID_GENERATOR")
	@Column(name = "SUID")
	public Long getId() {
		return id;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo id
	 * @param id El nuevo id a modificar.
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo id_persona
	 * @return El id_persona asociado a la clase
	 */
	@Column(name = "SUIDPERSONA")
	public Long getId_persona() {
		return id_persona;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo id_persona
	 * @param id_persona El nuevo id_persona a modificar.
	 */
	public void setId_persona(Long id_persona) {
		this.id_persona = id_persona;
	}


	/**
	 * Metodo encargado de retornar el valor del atributo nombre
	 * @return El nombre asociado a la clase
	 */
	@Column(name = "SUNOMBRE")
	public String getNombre() {
		return nombre;
	}


	/**
	 * Metodo encargado de modificar el valor del atributo nombre
	 * @param nombre El nuevo nombre a modificar.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_persona=" + id_persona + ", nombre=" + nombre + "]";
	}
	/** 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((id_persona == null) ? 0 : id_persona.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	/** 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (id_persona == null) {
			if (other.id_persona != null)
				return false;
		} else if (!id_persona.equals(other.id_persona))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
}
