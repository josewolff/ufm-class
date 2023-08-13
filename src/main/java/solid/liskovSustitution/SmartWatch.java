package solid.liskovSustitution;

public class SmartWatch extends  Reloj {

    @Override
    public void verHora() {
       // super.verHora();
        System.out.println("ver hora SmartWathc");
    }
}
