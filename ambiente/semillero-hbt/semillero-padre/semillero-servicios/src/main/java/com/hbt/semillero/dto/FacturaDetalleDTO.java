/**
 * FacturaDetalleDTO.java
 */
package com.hbt.semillero.dto;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class FacturaDetalleDTO {
	
	private Long id;
	private Long factura_id;
	private Long comic_id;
	private Integer cantidad;
	private Integer precio_unitario;
	/**
	 * Constructor de la clase.
	 */
	public FacturaDetalleDTO() {
		
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
	 * Metodo encargado de retornar el valor del atributo factura_id
	 * @return El factura_id asociado a la clase
	 */
	public Long getFactura_id() {
		return factura_id;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo factura_id
	 * @param factura_id El nuevo factura_id a modificar.
	 */
	public void setFactura_id(Long factura_id) {
		this.factura_id = factura_id;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo comic_id
	 * @return El comic_id asociado a la clase
	 */
	public Long getComic_id() {
		return comic_id;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo comic_id
	 * @param comic_id El nuevo comic_id a modificar.
	 */
	public void setComic_id(Long comic_id) {
		this.comic_id = comic_id;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo cantidad
	 * @return El cantidad asociado a la clase
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo cantidad
	 * @param cantidad El nuevo cantidad a modificar.
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo precio_unitario
	 * @return El precio_unitario asociado a la clase
	 */
	public Integer getPrecio_unitario() {
		return precio_unitario;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo precio_unitario
	 * @param precio_unitario El nuevo precio_unitario a modificar.
	 */
	public void setPrecio_unitario(Integer precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	/** 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "FacturaDetalleDTO [id=" + id + ", factura_id=" + factura_id + ", comic_id=" + comic_id + ", cantidad="
				+ cantidad + ", precio_unitario=" + precio_unitario + "]";
	}
	/** 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cantidad == null) ? 0 : cantidad.hashCode());
		result = prime * result + ((comic_id == null) ? 0 : comic_id.hashCode());
		result = prime * result + ((factura_id == null) ? 0 : factura_id.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((precio_unitario == null) ? 0 : precio_unitario.hashCode());
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
		FacturaDetalleDTO other = (FacturaDetalleDTO) obj;
		if (cantidad == null) {
			if (other.cantidad != null)
				return false;
		} else if (!cantidad.equals(other.cantidad))
			return false;
		if (comic_id == null) {
			if (other.comic_id != null)
				return false;
		} else if (!comic_id.equals(other.comic_id))
			return false;
		if (factura_id == null) {
			if (other.factura_id != null)
				return false;
		} else if (!factura_id.equals(other.factura_id))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (precio_unitario == null) {
			if (other.precio_unitario != null)
				return false;
		} else if (!precio_unitario.equals(other.precio_unitario))
			return false;
		return true;
	}
	
	
}
