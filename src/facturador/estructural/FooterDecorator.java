/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;

import creacional.ComprobanteElectronico;


/**
 *
 * @author Administrador
 */
public class FooterDecorator extends ComprobanteDecorator {

    private ComprobanteElectronico comprobante;
    public FooterDecorator(){    
    }
    
    public FooterDecorator(ComprobanteElectronico comprobante){
        this.comprobante = comprobante;
        detallesEmisor.add("Footer: ***Footeer***");
    }
    
}
