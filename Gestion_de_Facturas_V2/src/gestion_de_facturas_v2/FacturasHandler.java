package gestion_de_facturas_v2;

import com.sun.xml.internal.ws.util.VersionUtil;
import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class FacturasHandler extends DefaultHandler{
    
    private ArrayList<Factura> facturas= new ArrayList();
    private Factura factura;
    private StringBuilder buffer = new StringBuilder();
    public static ArrayList<String> guardar = new ArrayList();

    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        buffer.append(ch, start, length);
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
       double sums=0;
       double sumc=0;
        switch(qName){
            
             case "claveAccesoConsultada":
                 factura.setClaveAccesoConsultada(buffer.toString());
                 System.out.println("clave: "+ factura.getClaveAccesoConsultada());
                 guardar.add(factura.getClaveAccesoConsultada());
                 break;
                
            case "ambiente":
                factura.setAmbiente(buffer.toString());
                System.out.println("ambiente: "+ factura.getAmbiente());
                guardar.add(factura.getAmbiente());
                break;
            case "autorizacion":
                 break;
            
            case "RespuestaAutorizacionComprobante":
                break; 
                
            case "nombreComercial":
                factura.setNombreProveedor(buffer.toString());
                 System.out.println("proveedor: "+ factura.getNombreProveedor());
                 guardar.add(factura.getNombreProveedor());
                break;
                
            case "ruc":
                factura.setRuc(buffer.toString());
                 System.out.println("RUC prov: "+ factura.getRuc());
                 guardar.add(factura.getRuc());
                break;
            case "dirMatriz":
                factura.setDirMatriz(buffer.toString());
                 System.out.println("dir matriz: "+ factura.getDirMatriz());
                 guardar.add(factura.getDirMatriz());
                break;
            case "dirEstablecimiento":
                factura.setDirEstablecimiento(buffer.toString());
                 System.out.println("dir matriz: "+ factura.getDirEstablecimiento());
                 guardar.add(factura.getDirEstablecimiento());
                break;
            case "razonSocialComprador":
                 factura.setNombreCliente(buffer.toString());
                 System.out.println("nombre cli: "+ factura.getNombreCliente());
                 guardar.add(factura.getNombreCliente());
                break;
            case "identificacionComprador":
                 factura.setIdentificaciónCli(buffer.toString());
                 System.out.println("idntificacion cli: "+ factura.getIdentificaciónCli());
                 guardar.add(factura.getIdentificaciónCli());
                break;
            case "secuencial":
                 factura.setCodFact(buffer.toString());
                 System.out.println("codigo fact: "+ factura.getCodFact());
                 guardar.add(factura.getCodFact());
                break;
            case "fechaEmision":
                 factura.setFechaEmision(buffer.toString());
                 System.out.println("Fecha: "+ factura.getFechaEmision());
                  guardar.add(factura.getFechaEmision());
                break;
//___________________________________________________________________________________________________________                
           case "campoAdicional":
               switch(factura.getNombreCampoAdicional()){
                   case "DEDUCIBLE ALIMENTACION":
                        factura.setCampoAdicional(Float.parseFloat(buffer.toString()));
                    System.out.println("campo adicional ALIMENTACION "+ factura.getCampoAdicional());
                    guardar.add(factura.getCampoAdicional().toString());   
                    break;
                    
                    case "DEDUCIBLE VESTIMENETA":
                        factura.setCampoAdicional(Float.parseFloat(buffer.toString()));
                    System.out.println("campo adicional Vestimente "+ factura.getCampoAdicional());
                    guardar.add(factura.getCampoAdicional().toString());   
                    break;
                    
                    case "AHORRO AFILIADO":
                        factura.setCampoAdicional(Float.parseFloat(buffer.toString()));
                    System.out.println("campo adicional ahorro Afiliado "+ factura.getCampoAdicional());
                    guardar.add(factura.getCampoAdicional().toString());   
                    break;
                    
                     case "AHORRO POR DESCUENTOS":
                        factura.setCampoAdicional(Float.parseFloat(buffer.toString()));
                    System.out.println("campo adicional ahorro Descuentos "+ factura.getCampoAdicional());
                    guardar.add(factura.getCampoAdicional().toString());   
                    break;
                    case "AHORRO TOTAL":
                        factura.setCampoAdicional(Float.parseFloat(buffer.toString()));
                    System.out.println("campo adicional ahorro total "+ factura.getCampoAdicional());
                    guardar.add(factura.getCampoAdicional().toString());   
                    break;                   
               }                
                break;
                
//_________________________________________________________________________________________________________________________
           case "precioTotalSinImpuesto":
                 factura.setPrecioTotalSinImpuestos(Float.parseFloat(buffer.toString()));
                 sums=sums+factura.getPrecioTotalSinImpuestos();
                 System.out.println("total sin imp "+ sums);
                  guardar.add(factura.getPrecioTotalSinImpuestos().toString());
                 break;
            case "precioTotalConImpuesto":
                 factura.setPrecioTotalConImpuestos(Float.parseFloat(buffer.toString()));
                 sumc=sumc+factura.getPrecioTotalConImpuestos();
                 System.out.println("total con imp "+ sumc);
                 guardar.add(factura.getPrecioTotalConImpuestos().toString());
                 break;                              
        }       
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        switch(qName){
            case "ambiente":
                buffer.delete(0, buffer.length());
                break;           
            case "claveAccesoConsultada":
                buffer.delete(0, buffer.length());
                break;
            case "RespuestaAutorizacionComprobante":
                factura = new Factura();
                facturas.add(factura);
                break;
            case "autorizacion":
                factura = new Factura();
                facturas.add(factura);
                break;
            case "nombreComercial":
                buffer.delete(0, buffer.length());
                break;
            case "ruc":
                 buffer.delete(0, buffer.length());
                break;  
            case "dirMatriz":
                buffer.delete(0, buffer.length());
                break;
            case "dirEstablecimiento":
                buffer.delete(0, buffer.length());
                break;
            case "razonSocialComprador":
                buffer.delete(0, buffer.length());
                break;
            case "identificacionComprador":
                 buffer.delete(0, buffer.length());
                 break;
            case "secuencial":
                 buffer.delete(0, buffer.length());
                 break;
            case "fechaEmision":
                 buffer.delete(0, buffer.length());
                 break;
            case "campoAdicional":
                 buffer.delete(0, buffer.length());
                   factura.setNombreCampoAdicional(attributes.getValue("nombre"));
                 break;
                 //factura.setAlimentacion(Integer.parseInt(atributes.getValue("numero")));
            case "precioTotalSinImpuesto":
                 buffer.delete(0, buffer.length());
                 break;
            case "precioTotalConImpuesto":
                 buffer.delete(0, buffer.length());
                 break;    
                 
        }        
    }    
}
