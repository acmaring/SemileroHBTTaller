/**
 * ProveedorDTO.java
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
@Table(name="TC_PROVEEDOR")
public class Proveedor {
	
	private Long id;
	private Long id_persona;
	/**
	 * Constructor de la clase.
	 */
	public Proveedor() {
		
	}
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
	@Id
	@SequenceGenerator(allocationSize = 1, name = "TCPROVEEDOR_SPID_GENERATOR", sequenceName = "SEQ_TCPROVEEDOR")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TCPROVEEDOR_SPID_GENERATOR")
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
	 * Metodo encargado de retornar el valor del atributo id_persona
	 * @return El id_persona asociado a la clase
	 */
	@Column(name = "SPIDPERSONA")
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
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ProveedorDTO [id=" + id + ", id_persona=" + id_persona + "]";
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
		Proveedor other = (Proveedor) obj;
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
		return true;
	}
	
}
