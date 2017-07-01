package typeM.Czerwoni.model;

public class EmployeeProject {

    private String projectName;
    private int projectHours;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectHours() {
        return projectHours;
    }

    public void setProjectHours(int projectHours) {
        this.projectHours = projectHours;
    }

    public EmployeeProject(String projectName, int projectHours) {
        this.projectName = projectName;
        this.projectHours = projectHours;
    }
}
