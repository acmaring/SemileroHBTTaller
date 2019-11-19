/**
 * ProveedorDTO.java
 */
package com.hbt.semillero.dto;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class ProveedorDTO {
	private Long id;
	private Long id_persona;
	/**
	 * Constructor de la clase.
	 */
	public ProveedorDTO() {
		
	}
	/**
	 * Metodo encargado de retornar el valor del atributo id
	 * @return El id asociado a la clase
	 */
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
		ProveedorDTO other = (ProveedorDTO) obj;
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
