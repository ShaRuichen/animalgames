package filter;

public class Animal {

    private String name;
    private String gender;
    private String project;

    public Animal(String name, String gender, String project) {
        this.name = name;
        this.gender = gender;
        this.project = project;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getproject() {
        return project;
    }
}
