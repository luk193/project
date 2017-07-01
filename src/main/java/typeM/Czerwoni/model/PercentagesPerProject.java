package typeM.Czerwoni.model;

import java.util.List;

public class PercentagesPerProject {

    private String employee;
    private List<EmployeeProject> perprojectList;

    public PercentagesPerProject(String employee, List<EmployeeProject> perprojectList) {
        this.employee = employee;
        this.perprojectList = perprojectList;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public List<EmployeeProject> getPerprojectList() {
        return perprojectList;
    }

    public void setPerprojectList(List<EmployeeProject> perprojectList) {
        this.perprojectList = perprojectList;
    }


}
