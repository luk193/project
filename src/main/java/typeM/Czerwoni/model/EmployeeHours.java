package typeM.Czerwoni.model;

/**
 * Created by student on 01.07.2017.
 */
public class EmployeeHours {

    private String employee;
    private int hours;

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public EmployeeHours(String employee, int hours) {
        this.employee = employee;
        this.hours = hours;
    }

}



