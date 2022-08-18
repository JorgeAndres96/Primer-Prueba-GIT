package Correccion;

import Correccion.Asistente;

public class Preferencial extends Asistente {

    private boolean participaSorteo;

    public Preferencial(String idTiqute, String nombreCompleto, String direccionResidencia) {
        super(idTiqute, nombreCompleto, direccionResidencia);
        this.participaSorteo = false;
    }

    public boolean isParticipaSorteo() {
        return participaSorteo;
    }

    public void setParticipaSorteo(boolean participaSorteo) {
        this.participaSorteo = participaSorteo;
    }

    public void participarSorteo() {
        this.participaSorteo = !this.participaSorteo;
    }

}
