package CapaLogica;

import javax.swing.JTextField;

public class BitacoraCero {
    
    
    
    
    private String nombre;
    private String materia;
    private String fecha;
    private String licencia;
    private String grupo;
    private String cedula;
    

//    // <-- así SÍ compila
//public void agregarRegistro(JTextField nombre, JTextField tipo, JTextField tiempo, JTextField grupos, JTextField cedula, JTextField licencia, JTextField grupos1) {
//    // tu lógica para almacenar el registro
//}
// {
//        this.nombre = nombre;
//        this.materia = materia;
//        this.fecha = fecha;
//        this.licencia = licencia;
//        this.grupo = grupo;
//       this.cedula = cedula;
//    }
//
//   public String[] coArray(){
//       return new String[] {nombre, materia, fecha, licencia, grupo, cedula };
//       
//   }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
   }



