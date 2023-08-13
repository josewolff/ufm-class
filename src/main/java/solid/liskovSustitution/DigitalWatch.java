package solid.liskovSustitution;

public class DigitalWatch  extends  Reloj {

    @Override
    public void verHora() {
        super.verHora();
        System.out.println("viendo hora digital");
    }
}
