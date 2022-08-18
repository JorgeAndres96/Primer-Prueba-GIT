package Correccion;

import java.util.Random;

public class Asistente {
    
    protected String idTiqute;
    protected String nombreCompleto;
    protected String direccionResidencia;
    protected String credenciales;

    public Asistente(String idTiquete, String nombreCompleto, String direccionResidencia) {
        this.idTiqute = idTiquete;
        this.nombreCompleto = nombreCompleto;
        this.direccionResidencia = direccionResidencia;
        this.credenciales = "";
    }

    public String getIdTiquete() {
        return idTiqute;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public String getCredenciales() {
        return credenciales;
    }

    public void setIdTiquete(String idTiqute) {
        this.idTiqute = idTiqute;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public void setCredenciales(String credenciales) {
        this.credenciales = credenciales;
    }
    
    
    public void generarCredenciales() {
        if(credenciales.isEmpty()){ 
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencial = String.valueOf(x);
            credenciales = credencial;
        }
    }
    
    
}
