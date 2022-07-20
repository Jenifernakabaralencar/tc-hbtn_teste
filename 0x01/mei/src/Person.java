import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
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
        Date anoAtual = new Date(System.currentTimeMillis());
        SimpleDateFormat formatarData = new SimpleDateFormat("yyyy");
        System.out.println(formatarData.format(anoAtual));
        if ((getSalary() * 12) < 130000
                && (anoAtual.getYear() - birthDate.getYear()) > 18
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
