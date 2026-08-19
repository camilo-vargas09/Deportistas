public class Futbolista extends Deportista{

    private double tiempoEntrenamineto;
    private String equipo;
    private int goles;

    public Futbolista() {
    }

    public Futbolista(String nombre, int edad, String pais, int horasEntrenamiento, double tiempoEntrenamineto, String equipo, int goles) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.tiempoEntrenamineto = tiempoEntrenamineto;
        this.equipo = equipo;
        this.goles = goles;
    }

    public double getTiempoEntrenamineto() {
        return tiempoEntrenamineto;
    }

    public void setTiempoEntrenamineto(double tiempoEntrenamineto) {
        this.tiempoEntrenamineto = tiempoEntrenamineto;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "tiempoEntrenamineto=" + tiempoEntrenamineto +
                ", equipo='" + equipo + '\'' +
                ", goles=" + goles +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", pais='" + pais + '\'' +
                ", horasEntrenamiento=" + horasEntrenamiento +
                '}';
    }



    @Override
    public double calcularRendimiento() {
        return 0;
    }
}
