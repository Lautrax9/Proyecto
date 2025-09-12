package CapaLogica;
public class BitacoraCero {
    
    
    
    
    private String nombreCompleto;
    private String materia;
    private String fecha;
    private String tipoLicencia;
    private String grupo;
    private String cedula;

    // <-- así SÍ compila
public void agregarRegistro(String nombre,
                            String tipo,
                            String tiempo,
                            String grupos,
                            String cedula) {
    // tu lógica para almacenar el registro
}
 {
        this.nombreCompleto = nombreCompleto;
        this.materia = materia;
        this.fecha = fecha;
        this.tipoLicencia = tipoLicencia;
        this.grupo = grupo;
       this.cedula = cedula;
    }

    // Getters opcionales si querés mostrar los datos en una tabla
    public String[] toArray() {
        return new String[] { nombreCompleto, materia, fecha, tipoLicencia, grupo, cedula };
    }

    public void agregarRegistro(String nombreTxt, String tipoLicencia, String tiempoTxt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
