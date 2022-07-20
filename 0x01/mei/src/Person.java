import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Person {
    private String name;
    private String surname;
    private Date birthDate;
    private boolean anotherCompanyOwner;
    private boolean pensioner;
    private boolean publicServer;
    private float salary;

    public Person(String name, String surname, Date birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.pensioner = pensioner;
        this.publicServer = publicServer;
    }

    public String fullName() {
        return name + " " + surname;
    }

    public float calculateYearlySalary() {
        return (salary * 12);
    }

    public boolean isMEI() {
        LocalDate anoAtual = LocalDate.now();
        LocalDate anoDeNascimento = birthDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int ano = anoAtual.getYear();
        int ano2 = anoDeNascimento.getYear();

        if ((getSalary() * 12) < 130000
                && ( ano - ano2) > 18
                && !anotherCompanyOwner
                && !pensioner
                && !publicServer) {

            return true;

        }
        return false;
    }


    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public boolean isAnotherCompanyOwner() {
        return anotherCompanyOwner;
    }

    public boolean isPensioner() {
        return pensioner;
    }

    public boolean isPublicServer() {
        return publicServer;
    }

    public float getSalary() {
        return salary;


    }
}
