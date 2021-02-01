public class Person {

    private String name;
    private String cohort;

    public Person(String name, String cohort) {
        this.name = name;
        this.cohort = cohort;
    }

    public String getName(){
        return this.name;
    }

    public String getCohort() {
        return this.cohort;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setCohort(String newCohort) {
        this.cohort = newCohort;
    }

    public String talk(String language) {
        return "I love " + language;
    }

}
