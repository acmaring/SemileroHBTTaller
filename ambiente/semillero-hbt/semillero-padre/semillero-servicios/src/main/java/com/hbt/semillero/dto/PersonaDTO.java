/**
 * PersonaDTO.java
 */
package com.hbt.semillero.dto;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class PersonaDTO {
	private Long id;
	private Integer numIdetnificacion;
	/**
	 * Constructor de la clase.
	 */
	public PersonaDTO() {
		
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
	 * Metodo encargado de retornar el valor del atributo numIdetnificacion
	 * @return El numIdetnificacion asociado a la clase
	 */
	public Integer getNumIdetnificacion() {
		return numIdetnificacion;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo numIdetnificacion
	 * @param numIdetnificacion El nuevo numIdetnificacion a modificar.
	 */
	public void setNumIdetnificacion(Integer numIdetnificacion) {
		this.numIdetnificacion = numIdetnificacion;
	}
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PersonaDTO [id=" + id + ", numIdetnificacion=" + numIdetnificacion + "]";
	}
	/** 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((numIdetnificacion == null) ? 0 : numIdetnificacion.hashCode());
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
		PersonaDTO other = (PersonaDTO) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (numIdetnificacion == null) {
			if (other.numIdetnificacion != null)
				return false;
		} else if (!numIdetnificacion.equals(other.numIdetnificacion))
			return false;
		return true;
	}
	
	
}
