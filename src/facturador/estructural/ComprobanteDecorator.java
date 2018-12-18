/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturador.estructural;


import creacional.ComprobanteElectronico;
import java.util.List;

/**
 *
 * @author Administrador
 */
public abstract class ComprobanteDecorator extends ComprobanteElectronico{
    ComprobanteElectronico comprobante;
    public void Decorator(){
    }
    public void DetalleDecorator(ComprobanteElectronico comprobante){
        this.comprobante=comprobante;
    }
    public List<String> getDetallesEmisor(){    
        return super.detallesEmisor;
    }
    public ComprobanteElectronico getComprobante(){
        return comprobante;
    }
}
