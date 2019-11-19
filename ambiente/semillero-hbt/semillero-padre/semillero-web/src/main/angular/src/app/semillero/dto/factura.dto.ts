/**
 * @description Clase FacturaDTO
 * 
 * @author Andrés Camilo Marín González
 */
export class FacturaDTO {
    /**
     * atributo de FacturaDTO
     */
    public id : string;
    /**
     * atributo de FacturaDTO
     */
	public cliente : string;
    /**
     * atributo de FacturaDTO
     */
    public proveedor : string;
    /**
     * atributo de FacturaDTO
     */
    public iva : number;
    /**
     * atributo de FacturaDTO
     */
    public total : number;
    /**
     * atributo de FacturaDTO
     */
    public tipo : string;
    /**
     * atributo de FacturaDTO
     */
    public factEstado : string;
}