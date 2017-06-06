package ControlDB;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class OperacionesBD {
    
    public Object [][] select(String table, String fields, String where, Connection conect){
        int registros = 0;
        String colname[] = fields.split(",");
        
        //Consultas SQL
        String q = "SELECT " + fields + "FROM " + table;
        String q2 = "SELECT count(*) as total FROM "+ table;
        
            if(where!=null){
                q+= " WHERE "+ where;
                q2+= " WHERE "+ where;               
            }
            
        try {
            PreparedStatement pstm = conect.prepareStatement(q2);
            ResultSet resp = pstm.executeQuery();
            resp.next();
            registros =resp.getInt("total");
            resp.close();
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //se crea un objeto con tantas filas y columnas que necesite
        
        Object[][] data = new String[registros][fields.split(",").length];
        try {
            //se realiza una consulta SQL y se envia los datos a una matriz de objetos
            PreparedStatement pstm = conect.prepareStatement(q);
            ResultSet resp = pstm.executeQuery();
            int i = 0;
            
            while(resp.next()){
                for(int j=0; j<=fields.split(",").length-1;j++){
                    data[i][j] = resp.getString(colname[j].trim());
                }
                i++;
                resp.close();
            }      
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return data;        
    }
    
    public Object[][] getFactura(Connection conect){
        Object[][] resp = this.select("Factura","nombreProb ,rucProv , dirProv, "
                + "nombreCli, cedulaCli, codigo, fecha , totGastoAlimentacion ,"
                + "totGastoVestimenta,totGastoVivienda, totGastoSalud,totGastoEducacion ,"
                + "totGastoOtros,totFactSinIVA, totFactConIVA ", null, conect);
        if(resp.length>0){
            return resp;
        }else{
         return null;
        }       
    }
    
    public boolean insert(String table, String fields, String values,Connection conect ){
        
        boolean resp = false;
        //Se arma la consulta
        String q= "INSERT INTO " + table + " ( " + fields + " ) VALUES ( "+ values + " ) ";
        //se ejecuta la consulta
        try {
            PreparedStatement pstm = conect.prepareStatement(q);
            pstm.execute();
            pstm.close();
            resp=true;
            
            JOptionPane.showMessageDialog(null, "Insertado correctamente");
        } catch (SQLException ex) {
            Logger.getLogger(OperacionesBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resp;
    
    }    
}
