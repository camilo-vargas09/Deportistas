import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Deportista> lstDeportistas = new ArrayList<>();

        Corredor corredor1 = new Corredor("camilo", 19 , "Colombia", 35, 3.45, 15.5);
        Ciclista ciclista1 = new Ciclista("Andres", 20, "Argentina", 58, 248.3, 70, 54);
        Nadador nadador1 = new Nadador("Jacob", 22, "Brasil", 60, 35, 15.2, "Mariposa");

        lstDeportistas.add(corredor1);
        lstDeportistas.add(ciclista1);
        lstDeportistas.add(nadador1);

        for(Deportista d1 : lstDeportistas){
            System.out.println(d1);
        }

    }
}