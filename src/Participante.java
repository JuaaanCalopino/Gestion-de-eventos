public class Participante extends Persona {
    private String identificacion;
    private TipoParticipante tipoParticipante;

    public Participante(String nombre, String apellido, String telefono, String identificacion, TipoParticipante tipoParticipante) {
        super(nombre, apellido, telefono);
        this.identificacion = identificacion;
        this.tipoParticipante = tipoParticipante;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public TipoParticipante getTipoParticipante() {
        return tipoParticipante;
    }

    public void setTipoParticipante(TipoParticipante tipoParticipante) {
        this.tipoParticipante = tipoParticipante;
    }
}
