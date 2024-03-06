package esercizio3;

public class Cliente {

    //    ATTRIBUTES
    private String clientCode;
    private String nameAndSurname;
    private String email;
    private String subDate;

    //    CONSTRUCTOR
    public Cliente(String clientCode, String nameAndSurname, String email, String subDate) {
        this.clientCode = clientCode;
        this.nameAndSurname = nameAndSurname;
        this.email = email;
        this.subDate = subDate;
    }

    //    METHODS
    @Override
    public String toString() {
        return "Cliente{" +
                "clientCode='" + clientCode + '\'' +
                ", nameAndSurname='" + nameAndSurname + '\'' +
                ", email='" + email + '\'' +
                ", subDate=" + subDate +
                '}';
    }
}
