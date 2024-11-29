public class SalonDeEvento extends Lugar {
    private boolean estaDisponible;

    public SalonDeEvento(String direccion, boolean estaDisponible) {
        super(direccion);
        this.estaDisponible = estaDisponible;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
}

