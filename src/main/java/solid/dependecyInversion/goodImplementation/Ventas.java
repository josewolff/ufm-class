package solid.dependecyInversion.goodImplementation;

public class Ventas extends Empleado {

    private String firstName;
    private String lastName;
    private String department;

    public Ventas(String firstName, String lastName, String department){
        super(firstName, lastName);
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
    }
}
