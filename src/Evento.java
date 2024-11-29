import java.util.List;
import java.util.ArrayList;

public class Evento {
    private String idEvento;
    private String nombre;
    private String fecha;
    private int capacidad;
    private TipoEvento tipoEvento;
    private List<Participante> participantes;
    private Lugar lugar;

    public Evento(String idEvento, String nombre, String fecha, int capacidad, TipoEvento tipoEvento) {
        this.idEvento = idEvento;
        this.nombre = nombre;
        this.fecha = fecha;
        this.capacidad = capacidad;
        this.tipoEvento = tipoEvento;
        this.participantes = new ArrayList<>();
    }

    public void registrarParticipante(Participante participante) {
        if (participantes.size() < capacidad) {
            participantes.add(participante);
        } else {
            System.out.println("Capacidad máxima alcanzada");
        }
    }

    public List<Participante> obtenerListaDeParticipantes() {
        return participantes;
    }

    public void asignarLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public String getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(String idEvento) {
        this.idEvento = idEvento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
}
