package systemTesting;

import com.github.javafaker.Faker;

public class Users {

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    public Users(){
        Faker faker =  new Faker();
        this.firstname = faker.name().firstName();
        this.lastname = faker.name().lastName();
        this.email = faker.internet().emailAddress();
        this.password = faker.internet().password();
    }


    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString(){
        return "User\n\t" +
                "Firstname: " + getFirstname() +
                "\n\tLastname: " + getLastname() +
                "\n\tEmail: " + getEmail() +
                "\n\tPassword: " + getPassword();
    }
}
