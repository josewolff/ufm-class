package solid.dependecyInversion.goodImplementation;

import java.util.ArrayList;
import java.util.List;

public class MainDependecyInversionGoodImp {

    public static void main(String[] args){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Ingenieria("first", "la","asdf"));
        empleados.add(new Ventas("first", "la","asdf"));
    }
}
