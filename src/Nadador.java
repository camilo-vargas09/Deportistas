public class Nadador extends Deportista{

    private double distancia;
    private double tiempo;
    private String estilo;

    public Nadador() {
    }

    public Nadador(String nombre, int edad, String pais, int horasEntrenamiento, double distancia, double tiempo, String estilo) {
        super(nombre, edad, pais, horasEntrenamiento);
        this.distancia = distancia;
        this.tiempo = tiempo;
        this.estilo = estilo;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }




    public double calcularVelocidad(){
        double porcentaje;
        switch (estilo.toLowerCase()) {

            case "libre":
                porcentaje = 1.10;
                break;

            case "espalda":
                porcentaje = 0.08;
                break;

            case "pecho":
                porcentaje = 0.06;
                break;

            case "mariposa":
                porcentaje = 0.12;
                break;

            default:
                porcentaje=0;
                break;
        }
        return porcentaje;
    }
    @Override
    public double calcularRendimiento() {

        double rendimientoBase = calcularRendimiento();

        double bono = rendimientoBase * 0.12;


        return rendimientoBase + bono;
    }

    public void mostrarDetalles(){

        System.out.println("Distancia"+ distancia);
        System.out.println("Tiempo"+ tiempo);
        System.out.println("Estilo"+ estilo);

    }
}
