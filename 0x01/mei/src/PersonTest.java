import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class PersonTest {

    Person pessoa;
    @BeforeEach
    public void setup(){
       pessoa = new Person("Paul", "McCartney", 2000, true, true, true);
    }

    @Test
    public void show_full_name(){
        setup();
        Assert.assertEquals("Paul McCartney", pessoa.fullName());
    }
    @Test
    public void test_calculateYearlySalary(){
        pessoa.setSalary(1200);
        Assert.assertEquals(14400, pessoa.calculateYearlySalary(),0.03);
    }
    @Test
    public void person_is_MEI(){
        pessoa = new Person("Paul", "McCartney", 1990, false, false, false);
        Assert.assertTrue(true);
    }
    @Test
    public void person_is_not_MEI(){
        setup();
        Assert.assertFalse(false);
    }
}
