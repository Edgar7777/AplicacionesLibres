package ControlDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {
    private Connection conect = null;
    
    public Connection CrearBD(){
 
        try {
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            try {
                //se obtiene la conexion
                conect = DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB;create=true");
                
                if(conect!=null){
                    System.out.println("OK base de datos lista");
                    
                    String crearTabla="create table Factura(nombreProb varchar(100),rucProv varchar(13), "
                            + "dirProv varchar(100), nombreCli varchar(100), cedulaCli varchar(13), codigo varchar(10), "
                            + "fecha varchar(10), totGastoAlimentacion float,totGastoVestimenta float,totGastoVivienda float,"
                            + " totGastoSalud float,totGastoEducacion float,totGastoOtros float,totFactSinIVA float, "
                            + "totFactConIVA float)";
                    String desc="disconnect;";
                    
                    PreparedStatement pstm = conect.prepareStatement(crearTabla);
                    pstm.execute();
                    pstm.close();
                    
                    PreparedStatement pstm2 = conect.prepareStatement(desc);
                    pstm2.execute();
                    pstm2.close();
                    
                    System.out.println("BD Creada correctamente");
                }
                
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conect;
    }
    
    public Connection AccederBD(){
        try {
            //se obtiene el driver para mysql
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //se obtiene la conexió
            conect =DriverManager.getConnection("jdbc:derby:.\\DB\\Derby.DB");
            
            if(conect!=null){
                System.out.println("Ok base de datos lista");
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conect;        
    }
    
    public void cerrarConexion(){
        try {
            conect.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
