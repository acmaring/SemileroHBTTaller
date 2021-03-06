/**
 * TipoEnum.java
 */
package com.hbt.semillero.entidad;

/**
 * <b>Descripción:<b> Clase que determina
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public enum TipoEnum {
	
	PEDIDO("enum.tipo.pedido"),
	VENTA("enum.tipo.pedido");
	
	/**
	 * Atributo que contiene el codigo del mensaje
	 */
	private String codigoMensaje;

	/**
	 * Constructor de la clase.
	 * @param codigoMensaje
	 */
	private TipoEnum(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}

	/**
	 * Metodo encargado de retornar el valor del atributo codigoMensaje
	 * @return El codigoMensaje asociado a la clase
	 */
	public String getCodigoMensaje() {
		return codigoMensaje;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo codigoMensaje
	 * @param codigoMensaje El nuevo codigoMensaje a modificar.
	 */
	public void setCodigoMensaje(String codigoMensaje) {
		this.codigoMensaje = codigoMensaje;
	}
	
	
}
