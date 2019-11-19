/**
 * GestionarFacturaBean.java
 */
package com.hbt.semillero.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.dto.FacturaDTO;
import com.hbt.semillero.dto.FacturaDetalleDTO;
import com.hbt.semillero.entidad.Comic;
import com.hbt.semillero.entidad.Factura;

/**
 * <b>Descripción:<b> Clase que gestiona los pedidos de la tienda de comics
 * <b>Caso de Uso:<b> 
 * @author camilo
 * @version 
 */
@Stateless
@TransactionManagement(TransactionManagementType.CONTAINER)
public class GestionarFacturaBean implements IGestionarFacturaLocal{

	@PersistenceContext
	private EntityManager em;
	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#modificarEstadoTipo(java.lang.Long)
	 */
	@Override
	public void modificarEstadoTipo(Long idfactura) {
		
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#crearPedido(com.hbt.semillero.dto.FacturaDTO)
	 * Metodo para crear una factura
	 */
	@Override
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void crearPedido(FacturaDTO nuevaFactura) {
		Factura factura = null;
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#crearDetalleFactura(com.hbt.semillero.dto.FacturaDetalleDTO)
	 */
	@Override
	public void crearDetalleFactura(FacturaDetalleDTO nuevoDetalle) {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#consultarPedido(java.lang.String)
	 */
	@Override
	public FacturaDTO consultarPedido(String id) {
		// TODO Auto-generated method stub
		
		return null;
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#consultarPedidosGeneral()
	 */
	@Override
	public List<FacturaDTO> consultarPedidosGeneral() {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#borrarPedido(java.lang.String)
	 */
	@Override
	public void borrarPedido(String idFactura) {
		// TODO Auto-generated method stub
		
	}

	/** 
	 * @see com.hbt.semillero.ejb.IGestionarFacturaLocal#calcularTotalPedido(com.hbt.semillero.dto.FacturaDTO)
	 */
	@Override
	public Integer calcularTotalPedido(FacturaDTO factura) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 
	 * Metodo encargado de transformar un comic a un comicDTO
	 * 
	 * @param comic
	 * @return
	 */
	private FacturaDTO convertirFacturaToFacturaDTO(Factura factura) {
		FacturaDTO facturaDTO = new FacturaDTO();
		if(facturaDTO.getId()!=null) {
			FacturaDTO.setId(factura.getId().toString());
		}
		facturaDTO.setCliente(factura.getCliente());
		facturaDTO.setIva(factura.getIva());
		facturaDTO.setProveedor(factura.getProveedor());
		facturaDTO.setTipoEnum(factura.getTipoEnum());
		facturaDTO.setTotal(factura.getTotal());
		
	
		return facturaDTO;
	}

	/**
	 * 
	 * Metodo encargado de transformar un comicDTO a un comic
	 * 
	 * @param comic
	 * @return
	 */
	private Comic convertirComicDTOToComic(ComicDTO comicDTO) {
		Comic comic = new Comic();
		if(comicDTO.getId()!=null) {
			comic.setId(Long.parseLong(comicDTO.getId()));
		}
		comic.setNombre(comicDTO.getNombre());
		comic.setEditorial(comicDTO.getEditorial());
		comic.setTematicaEnum(comicDTO.getTematicaEnum());
		comic.setColeccion(comicDTO.getColeccion());
		comic.setNumeroPaginas(comicDTO.getNumeroPaginas());
		comic.setPrecio(comicDTO.getPrecio());
		comic.setAutores(comicDTO.getAutores());
		comic.setColor(comicDTO.getColor());
		comic.setFechaVenta(comicDTO.getFechaVenta());
		comic.setEstadoEnum(comicDTO.getEstadoEnum());
		comic.setCantidad(comicDTO.getCantidad());
		return comic;
	}

}
