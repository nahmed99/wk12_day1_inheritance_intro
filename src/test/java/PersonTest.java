import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    Person person;

    @Before
    public void before() {
        person = new Person("Kidda", "E15");
    }

    @Test
    public void hasName() {
        assertEquals("Kidda", person.getName());
    }

    @Test
    public void hasCohort() {
        assertEquals("E15", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("Jane");
        assertEquals("Jane", person.getName());
    }

    @Test
    public void canChangeCohort(){
        person.setCohort("G22");
        assertEquals("G22", person.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person.talk("Java"));
    }
}
