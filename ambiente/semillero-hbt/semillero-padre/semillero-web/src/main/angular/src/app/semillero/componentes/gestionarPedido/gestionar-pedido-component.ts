
import { FacturaDTO } from '../../dto/factura.dto';
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
    
    ngOnInit(): void {

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
                facEstado : [null]
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
      }
 }