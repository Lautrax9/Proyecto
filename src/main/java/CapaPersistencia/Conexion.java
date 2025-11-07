
package CapaPersistencia;


import CapaException.BDException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    public static Connection getConnection() throws BDException {
        Connection con=null;
        try{
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/faltas?zeroDateTimeBehavior=CONVERT_TO_NULL","root","");
            System.out.println("************************** CONECTION STABLISHED *********************");
        }catch(SQLException sqle){
            throw new BDException("Error de conexion");
        }
            
        return con;
    }
            
            
    
    
}
