package solid.dependecyInversion.goodImplementation;

public class Ingenieria extends  Empleado{

    private String firstName;
    private String lastName;
    private String ingType;

    public Ingenieria(String firstName, String lastName, String ingType){
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.ingType = ingType;
    }
}
