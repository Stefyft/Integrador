/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integrador;

import comportamentales.AutorizadorSRI;
import comportamentales.EsquemaOffline;
import comportamentales.EsquemaOnline;
import creacional.ComprobanteElectronico;
import creacional.ComprobantesFactory;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author Freire
 */
public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Empresa de facturación electrónica Stupendo");
        ComprobantesFactory f1 = new ComprobantesFactory();
        ComprobanteElectronico comprobante = f1.getComprobante("FACTURA");
        comprobante.setClaveAcceso("1234");
        comprobante.setCodigo(1111);
        ArrayList<String> lista = new ArrayList<>();
        lista.add("producto1");
        lista.add("producto2");
        comprobante.setDetallesEmisor(lista);
        LocalDate date = LocalDate.of(2019, Month.JANUARY, 1);
        comprobante.setFecha(date);
        comprobante.setNombreCliente("Estefanía Freire");
        AutorizadorSRI sri = new AutorizadorSRI(new EsquemaOffline());
        sri.autorizar(comprobante);
        System.out.println(comprobante.toString());
        
        ComprobantesFactory f2 = new ComprobantesFactory();
        ComprobanteElectronico comprob2 = f2.getComprobante("GUIAREMISION");
        comprob2.setClaveAcceso("5678");
        comprob2.setCodigo(2222);
        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("producto1");
        lista2.add("producto2");
        comprob2.setDetallesEmisor(lista2);
        LocalDate date2 = LocalDate.of(2019, Month.JANUARY, 1);
        comprob2.setFecha(date2);
        comprob2.setNombreCliente("Leonardo Mendoza");
        AutorizadorSRI sri2 = new AutorizadorSRI(new EsquemaOnline());
        sri2.autorizar(comprob2);
        System.out.println(comprob2.toString());
        
        ComprobantesFactory f3 = new ComprobantesFactory();
        ComprobanteElectronico comprob3 = f3.getComprobante("NOTACREDITO");
        comprob3.setClaveAcceso("7777");
        comprob3.setCodigo(3333);
        ArrayList<String> lista3 = new ArrayList<>();
        lista3.add("producto5");
        lista3.add("producto6");
        comprob3.setDetallesEmisor(lista2);
        LocalDate date3 = LocalDate.of(2019, Month.JANUARY, 1);
        comprob3.setFecha(date3);
        comprob3.setNombreCliente("Carlos");
        AutorizadorSRI sri3 = new AutorizadorSRI(new EsquemaOnline());
        sri2.autorizar(comprob3);
        System.out.println(comprob3.toString());
    }
    
}
