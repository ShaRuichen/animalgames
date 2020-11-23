package BusinessDelegate;

public class Score {
    private String id;
    private String rank;
    private String project;

    public Score(String id, String rank, String project) {
        this.id = id;
        this.rank = rank;
        this.project = project;
    }

    public String getid() {
        return id;
    }

    public String getrank() {
        return rank;
    }

    public String getproject() {
        return project;
    }
}
