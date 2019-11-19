
import { FacturaDTO } from '../../dto/factura.dto';
import { FacturaDetalleDTO } from '../../dto/facturaDetalle.dto';
import { ProveedorDTO } from '../../dto/proveedor.dto';
import { PersonaDTO } from '../../dto/persona.dto';
import { UsuarioDTO } from '../../dto/usuario.dto';
import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { componentFactoryName } from '@angular/compiler';

/**
 * @description Componente encargado de gestionar los pedidos de la tienda de comics
 * 
 * @author Andres Camilo Marin Gonzalez
 */

 @Component({
     selector: 'gestionar-pedido',
     templateUrl: './gestionar-pedido.html',
     styleUrls: ['./gestionar-pedido.css']
 })

 export class GestionarPedidoComponent implements OnInit {
     
    /**
     * Atributo que tiene los controles del formulario
     */
    public gestionarPedidoForm : FormGroup;
    /**
     * Atrubuto bool que permite saber si se envio a validar el fomulario
     */
    public submitted : boolean;
    /**
     * Atributo que tendra la informacion del pedido
     */
    public factura : FacturaDTO;
    /**
     * Atributo que incrementa el id de la factura
     */
    public idFactura : number = 0;
    /**
     * Atributo que contiene la lista de facturas
     */
    public listaFacturas : Array<FacturaDTO>;
    
    /**
     * Evento angular que se ejecuta la invocar el componente GestionarPedidoComponent
     */
    ngOnInit(): void {
        this.factura = new FacturaDTO();
        this.listaFacturas = new Array<FacturaDTO>();
     }

     /**
      * @description constructor del componente GestionarPedidoComponent
      * @author Andres Camilo Marin Gonzalez
      */
     constructor(private fb : FormBuilder,
        private router : Router) {
            this.gestionarPedidoForm = this.fb.group({
                cliente : [null],
                proveedor : [null],
                iva : [null],
                total : [null],
                tipo : [null],
                factEstado : [null]
            });
        }

     /**
      * @description metodo que permite guardar un pedido
      */
      public crearPedido() : void {
            this.submitted = true;
            if (this.gestionarPedidoForm.invalid) {
                return;
            }
            this.idFactura++;
            this.factura = new FacturaDTO();
            this.factura.cliente = this.gestionarPedidoForm.controls.cliente.value;
            this.factura.factEstado = this.gestionarPedidoForm.controls.factEstado.value;
            this.factura.iva = this.gestionarPedidoForm.controls.iva.value;
            this.factura.proveedor = this.gestionarPedidoForm.controls.proveedor.value;
            this.factura.tipo = this.gestionarPedidoForm.controls.tipo.value;
            this.factura.total = this.gestionarPedidoForm.controls.total.value;

            this.listaFacturas.push(this.factura);
      }

      /**
       * 
       */

      /**
       * @description Metodo en cargado de obtener los controles y sus propiedades
       */
      get f(){
          return this.gestionarPedidoForm.controls;
      }
      /* TODO
      this.gestionarComicForm.controls.editorial.disable();

      Respuesta: Se utiliza cuando se quiere deshabilitar el control, es decir el campo
      del formulario, para que su valor no sea modificado. Tampoco realiza validaciones.
      
      *ngIf="submitted && f.nombre.errors"

      Respuesta: Es una directiva que permite renderisar contenido en un template cuando
      la condicion escrita en la directiva se cumpla, es decir, sea igual a true.
      */
 }