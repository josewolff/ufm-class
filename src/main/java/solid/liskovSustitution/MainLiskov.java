package solid.liskovSustitution;

public class MainLiskov {

    public static void main (String[] args){
        Reloj dw = new DigitalWatch();
        dw.verHora();

        System.out.println("\n\n");
        Reloj d2 =  new SmartWatch();
        d2.verHora();

    }
}
