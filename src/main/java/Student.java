public class Student extends Person{

    public Student(String name, String cohort) {
        // Pass parameters to parent class.
        super(name, cohort);
    }

    // Overriding method Person.talk
    public String talk(String language) {
        return "I love learning " + language;
    }

}
