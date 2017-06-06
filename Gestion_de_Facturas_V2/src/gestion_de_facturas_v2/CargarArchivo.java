
package gestion_de_facturas_v2;

import static gestion_de_facturas_v2.FacturasHandler.guardar;
import interfaz.Selector;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

public class CargarArchivo {

    public void cargarArchivoXML(File archivo) throws ParserConfigurationException, SAXException, IOException {
        
        File carpetaDestino = new File(".\\facturasXML");
        File archivoDestino = new File(carpetaDestino, archivo.getName());
        String streamArchivo = archivo.getAbsolutePath();
        
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser saxParser = saxParserFactory.newSAXParser();
        int numFacturas;
        
        for(numFacturas =0; numFacturas<1;numFacturas++){
            File archivoXML = new File(streamArchivo);            
            FacturasHandler handler = new FacturasHandler();
            saxParser.parse(archivoXML, handler); 
//            ArrayList<Factura> facturas = handler.getFacturas();
//                //ArrayList<Detalle> detalles = handler.getDetalles();
//        
            for(int i=0; i < guardar.size();i++){
             System.out.println(guardar.get(i));
                
            }
        }  
    }
    
}
