import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SeniorInstructorTest {

    SeniorInstructor seniorInstructor;

    @Before
    public void before(){
        seniorInstructor = new SeniorInstructor("Colin", "G6", "Java", "Extra");
    }

}
