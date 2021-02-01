public class Instructor extends Person {

    private String moduleTeam;

    public Instructor(String name, String cohort, String moduleTeam) {
        // Pass parameters to parent class.
        super(name, cohort);

        this.moduleTeam = moduleTeam;
    }


    public String getModuleTeam() {
        return this.moduleTeam;
    }

    public void setModuleTeam(String newModuleTeam) {
        this.moduleTeam = newModuleTeam;
    }

}