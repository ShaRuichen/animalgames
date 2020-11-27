package animalgames.businessdelegate;

/**
 * 比赛信息类，用于存放信息，实现对应的getter和setter
 */
public class Score {
    private String id;
    private String rank;
    private String project;

    public Score(String id, String rank, String project) {
        this.id = id;
        this.project = project;
        this.rank = rank;
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
