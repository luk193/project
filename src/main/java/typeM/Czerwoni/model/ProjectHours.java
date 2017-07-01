package typeM.Czerwoni.model;

/**
 * Created by student on 01.07.2017.
 */
public class ProjectHours {

    private String project;
    private int hours;

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public ProjectHours(String project, int hours) {
        this.project = project;
        this.hours = hours;
    }


}
