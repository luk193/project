package typeM.Czerwoni.model;

/**
 * Created by student on 01.07.2017.
 */
public class MonthProjectHours  {
    private String month;
    private String project;
    private int hours;

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

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

    public MonthProjectHours(String month, String project, int hours) {
        this.month = month;
        this.project = project;
        this.hours = hours;
    }

}
