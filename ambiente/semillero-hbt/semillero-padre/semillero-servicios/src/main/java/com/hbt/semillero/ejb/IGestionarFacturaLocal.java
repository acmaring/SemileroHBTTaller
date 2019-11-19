/**
 * IGestionarFacturaLocal.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;

/**
 * <b>Descripción:<b> Clase que determina la gestion de los pedidos
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
public interface IGestionarFacturaLocal {
	
	/**
	 * 
	 * Metodo encargado de cambiar el estado del campo pedido 
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @param facturadto
	 */
	public void modificarEstadoTipo(Long idfactura);
	
	/**
	 * 
	 * Metodo encargado de crear una factura
	 * <b>Caso de Uso</b>
	 * @author camilo
	 * 
	 * @param nuevaFactura
	 */
	public void crearPedido(FacturaDTO nuevaFactura);
	
	public void crearDetalleFactura(FacturaDetalleDTO nuevoDetalle);
	
	public FacturaDTO consultarPedido(String id);
	
	public List<FacturaDTO> consultarPedidosGeneral();
	
	public void borrarPedido(String idFactura);
	
	public Integer calcularTotalPedido(FacturaDTO factura);
	
	
}
