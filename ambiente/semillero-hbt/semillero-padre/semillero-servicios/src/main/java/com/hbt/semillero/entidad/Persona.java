/**
 * Persona.java
 */
package com.hbt.semillero.entidad;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
@Entity
@Table(name="TC_PERSONA")
public class Persona {
	
	private Long id;
	private Integer numIdentificacion;
	
	
	/**
	 * Constructor de la clase.
	 */
	public Persona() {
		
	}
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TCPERSONA_SPID_GENERATOR", sequenceName = "SEQ_TCPERSONA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TCPERSONA_SPID_GENERATOR")
	@Column(name = "SPID")
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
	 * Metodo encargado de retornar el valor del atributo numIdentificacion
	 * @return El numIdentificacion asociado a la clase
	 */
	@Column(name = "SCNUMIDENTIFICACION")
	public Integer getNumIdentificacion() {
		return numIdentificacion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo numIdentificacion
	 * @param numIdentificacion El nuevo numIdentificacion a modificar.
	 */
	public void setNumIdentificacion(Integer numIdetnificacion) {
		this.numIdentificacion = numIdetnificacion;
	}
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Persona [id=" + id + ", numIdentificacion=" + numIdentificacion + "]";
	}
	/** 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numIdentificacion == null) ? 0 : numIdentificacion.hashCode());
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
		Persona other = (Persona) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numIdentificacion == null) {
			if (other.numIdentificacion != null)
				return false;
		} else if (!numIdentificacion.equals(other.numIdentificacion))
			return false;
		return true;
	}
	
	
	
}
