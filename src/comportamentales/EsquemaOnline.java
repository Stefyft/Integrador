/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comportamentales;

import creacional.ComprobanteElectronico;

/**
 *
 * @author Freire
 */
public class EsquemaOnline implements Esquema {

    @Override
    public void autorizar(ComprobanteElectronico comprobante) {
        String cod= String.valueOf(comprobante.getCodigo());
        comprobante.setNumeroAutorizacion(cod);
    }
    
}
