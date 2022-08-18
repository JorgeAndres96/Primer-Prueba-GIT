package Correccion;

import java.util.Random;

public class VIP extends Asistente{
    
    private boolean [] pantallas;
    private String credencialesPrevia;

    public VIP(String idTiqute, String nombreCompleto, String direccionResidencia) {
        super(idTiqute, nombreCompleto, direccionResidencia);
        this.pantallas  = new boolean [] {false, false, false};
        this.credencialesPrevia = "";
    }

    public boolean[] getPantallas() {
        return pantallas;
    }

    public String getCredencialesPrevia() {
        return credencialesPrevia;
    }

    public void setPantallas(boolean[] pantallas) {
        this.pantallas = pantallas;
    }

    public void setCredencialesPrevia(String credencialesPrevia) {
        this.credencialesPrevia = credencialesPrevia;
    }
    
    public void generarCredencialesPrevia() {
        if(credencialesPrevia.isEmpty()){
            Random numero = new Random();
            int x = numero.nextInt(100000);
            String credencialPrevia = String.valueOf(x);
            credencialesPrevia = credencialPrevia;
        }
    }

    public void asignarPantalla (int pantalla){
        if (pantalla<=3 && pantalla>=1){
            if (pantalla == 1){
            if (this.pantallas[0]==false){this.pantallas[0]=true;}
        }else{this.pantallas[0]=false;}

        if (pantalla == 2){
            if (this.pantallas[1]==false){this.pantallas[1]=true;}
        }else  {this.pantallas[1]=false;}
        
        if (pantalla == 3){
            if (this.pantallas[2]==false){this.pantallas[1]=true;}
        }else  {this.pantallas[2]=false;} 
        }
    }
    
}
