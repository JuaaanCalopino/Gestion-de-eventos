public class Main {
    public static void main(String[] args) {
        // Crear las enumeraciones
        TipoEvento tipoEvento = TipoEvento.CONFERENCIA;
        Rol rol = Rol.ADMINISTRADOR;
        TipoParticipante tipoParticipante = TipoParticipante.PRESENTADOR;

        // Crear una persona (participante)
        Persona persona1 = new Persona("Juan", "Calopino", "0993389067");
        Persona persona2 = new Persona("Royel", "Pardo", "0981697989");

        // Crear participantes a partir de las personas
        Participante participante1 = new Participante(persona1.getNombre(), persona1.getApellido(), persona1.getTelefono(), "ID173", tipoParticipante);
        Participante participante2 = new Participante(persona2.getNombre(), persona2.getApellido(), persona2.getTelefono(), "ID144", TipoParticipante.INVITADO);

        // Crear un evento
        Evento evento = new Evento("E001", "Evento de Conferencia sobre Tecnología", "2024-12-05", 100, tipoEvento);
        System.out.println("Se ha creado el evento: " + evento.getNombre());

        // Registrar participantes en el evento
        evento.registrarParticipante(participante1);
        evento.registrarParticipante(participante2);
        System.out.println("Participantes registrados en el evento '" + evento.getNombre() + "':");
        for (Participante p : evento.obtenerListaDeParticipantes()) {
            System.out.println("- " + p.getNombre() + " " + p.getApellido() + " (Tipo: " + p.getTipoParticipante() + ")");
        }

        // Crear un organizador
        Organizador organizador = new Organizador("19008", "Carlos Granda", rol);
        System.out.println("El organizador del evento es: " + organizador.getNombre());

        // Crear un lugar para el evento
        Lugar lugar = new Lugar("Avenida Principal 18 de noviembre , Sala 45A");
        System.out.println("El evento se llevará a cabo en el lugar: " + lugar.getDireccion());

        // Crear un salón de evento y asignar el lugar
        SalonDeEvento salon = new SalonDeEvento(lugar.getDireccion(), true);
        System.out.println("El salón de evento está disponible: " + salon.isEstaDisponible());

        // Asignar el lugar al evento
        evento.asignarLugar(salon);
        System.out.println("Lugar asignado al evento '" + evento.getNombre() + "': " + lugar.getDireccion());

        // Simular un organizador creando un evento
        organizador.crearEvento();
        System.out.println("El organizador " + organizador.getNombre() + " ha creado el evento: " + evento.getNombre());


        // Mostrar el tipo de evento
        System.out.println("Tipo de evento: " + tipoEvento);
    }
}

