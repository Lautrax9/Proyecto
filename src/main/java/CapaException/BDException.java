package CapaException;

import javax.swing.JOptionPane;




public class BDException extends Exception {
//Recibe un String message (mensaje de error que quieras mostrar).
//super(message) llama al constructor de la 
//clase Exception y guarda ese mensaje para 
//que después puedas acceder a él con getMessage().
    public BDException(String message) {
        super(message);
    }
//JOptionPane.showMessageDialog(this, "hubo un error");
    }



