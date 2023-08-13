package solid.interfaceSegregation.wrong;

public class Carro implements  ICar{
    @Override
    public void rin18() {
        System.out.println("rin18");
    }

    @Override
    public void rin24() {
        //nothing
    }
}
