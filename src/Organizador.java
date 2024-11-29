import java.util.List;
import java.util.ArrayList;

public class Organizador implements iOrganizador {
    private String idOrganizador;
    private String nombre;
    private Rol rol;
    private boolean tipoOrganizador;
    private List<Evento> eventosGestionados;

    public Organizador(String idOrganizador, String nombre, Rol rol) {
        this.idOrganizador = idOrganizador;
        this.nombre = nombre;
        this.rol = rol;
        this.eventosGestionados = new ArrayList<>();
    }

    @Override
    public void crearEvento() {
        // Lógica para crear un evento
    }

    @Override
    public void invitarParticipante() {
        // Lógica para invitar a un participante
    }

    @Override
    public void asignarLugar() {
        // Lógica para asignar un lugar
    }

    public String getIdOrganizador() {
        return idOrganizador;
    }

    public void setIdOrganizador(String idOrganizador) {
        this.idOrganizador = idOrganizador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public boolean isTipoOrganizador() {
        return tipoOrganizador;
    }

    public void setTipoOrganizador(boolean tipoOrganizador) {
        this.tipoOrganizador = tipoOrganizador;
    }

    public List<Evento> getEventosGestionados() {
        return eventosGestionados;
    }

    public void setEventosGestionados(List<Evento> eventosGestionados) {
        this.eventosGestionados = eventosGestionados;
    }
}