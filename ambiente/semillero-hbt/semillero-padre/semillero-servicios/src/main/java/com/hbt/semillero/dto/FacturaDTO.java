/**
 * FacturaDTO.java
 */
package com.hbt.semillero.dto;

import com.hbt.semillero.entidad.FacEstadoEnum;
import com.hbt.semillero.entidad.TipoEnum;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public class FacturaDTO {
	
	private static final long serializable = 2L;
	
	private Long id;
	private Long cliente;
	private Long proveedor;
	private Integer iva;
	private Integer total;
	private TipoEnum tipoEnum;
	private FacEstadoEnum factEstadoEnum;
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
	 * Metodo encargado de retornar el valor del atributo cliente
	 * @return El cliente asociado a la clase
	 */
	public Long getCliente() {
		return cliente;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo cliente
	 * @param cliente El nuevo cliente a modificar.
	 */
	public void setCliente(Long cliente) {
		this.cliente = cliente;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo proveedor
	 * @return El proveedor asociado a la clase
	 */
	public Long getProveedor() {
		return proveedor;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo proveedor
	 * @param proveedor El nuevo proveedor a modificar.
	 */
	public void setProveedor(Long proveedor) {
		this.proveedor = proveedor;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo iva
	 * @return El iva asociado a la clase
	 */
	public Integer getIva() {
		return iva;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo iva
	 * @param iva El nuevo iva a modificar.
	 */
	public void setIva(Integer iva) {
		this.iva = iva;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo total
	 * @return El total asociado a la clase
	 */
	public Integer getTotal() {
		return total;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo total
	 * @param total El nuevo total a modificar.
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo tipoEnum
	 * @return El tipoEnum asociado a la clase
	 */
	public TipoEnum getTipoEnum() {
		return tipoEnum;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo tipoEnum
	 * @param tipoEnum El nuevo tipoEnum a modificar.
	 */
	public void setTipoEnum(TipoEnum tipoEnum) {
		this.tipoEnum = tipoEnum;
	}
	/**
	 * Metodo encargado de retornar el valor del atributo factEstadoEnum
	 * @return El factEstadoEnum asociado a la clase
	 */
	public FacEstadoEnum getFactEstadoEnum() {
		return factEstadoEnum;
	}
	/**
	 * Metodo encargado de modificar el valor del atributo factEstadoEnum
	 * @param factEstadoEnum El nuevo factEstadoEnum a modificar.
	 */
	public void setFactEstadoEnum(FacEstadoEnum factEstadoEnum) {
		this.factEstadoEnum = factEstadoEnum;
	}
	
	/**
	 * Método encargado de convertir los datos recibidos en JSON al tipo FacturaDTO.
	 * <b>Caso de Uso:</b>
	 * 
	 * @param arg Cadena que representa el objeto complejo JSON.
	 * @return Instancia con los datos recibidos.
	 */
	public static FacturaDTO valueOf(String arg) {
		return JsonUtils.valueOf(arg, FacturaDTO.class);
	}
	
	/** 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cliente == null) ? 0 : cliente.hashCode());
		result = prime * result + ((factEstadoEnum == null) ? 0 : factEstadoEnum.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((iva == null) ? 0 : iva.hashCode());
		result = prime * result + ((proveedor == null) ? 0 : proveedor.hashCode());
		result = prime * result + ((tipoEnum == null) ? 0 : tipoEnum.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		FacturaDTO other = (FacturaDTO) obj;
		if (cliente == null) {
			if (other.cliente != null)
				return false;
		} else if (!cliente.equals(other.cliente))
			return false;
		if (factEstadoEnum != other.factEstadoEnum)
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (iva == null) {
			if (other.iva != null)
				return false;
		} else if (!iva.equals(other.iva))
			return false;
		if (proveedor == null) {
			if (other.proveedor != null)
				return false;
		} else if (!proveedor.equals(other.proveedor))
			return false;
		if (tipoEnum != other.tipoEnum)
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}
	
}
