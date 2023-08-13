package solid.dependecyInversion.wrongImplementation;

import java.util.ArrayList;
import java.util.List;

public class MainDependecyInversion {

    public static void main(String[] args){
        List<Ingenieria> ingenieriaList = new ArrayList<Ingenieria>();
        List<Ventas> ventasList = new ArrayList<Ventas>();

        ingenieriaList.add(new Ingenieria("jose", "wolff","sistemas"));
        ingenieriaList.add(new Ingenieria("jose", "ferguson","industrial"));

        ventasList.add(new Ventas("jose", "wolff","sistemas"));
        ventasList.add(new Ventas("jose", "wolff","Indi"));
    }
}
