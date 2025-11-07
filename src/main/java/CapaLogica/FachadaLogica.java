package CapaLogica;

import CapaException.BDException;
import CapaException.PersonaException;
import CapaPersistencia.Persistencia;

public class FachadaLogica {

    private final Persistencia persistencia = new Persistencia();

    // Guarda un registro completo
    public void guardarRegistro(BitacoraCero registro) throws BDException {
        persistencia.guardarRegistro(registro);
    }

    // Busca un registro por cédula
    public BitacoraCero buscarPorCedula(String cedula) throws PersonaException, BDException {
        return persistencia.buscarPorCedula(cedula);
    }

    // Elimina un registro por cédula
    public void eliminarPorCedula(String cedula) throws PersonaException, BDException {
        persistencia.eliminarPorCedula(cedula);
    }

   
}
