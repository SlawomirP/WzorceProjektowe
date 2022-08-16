package adapterExpl;

import strategyExpl.Employee;

public class OfficialTrippingEmployee {
    private Employee employee;

    public OfficialTrippingEmployee(Employee employee) {
        this.employee = employee;
    }

    public void goToClient() {
        employee.goToWork();
        System.out.println("to client");
    }
}
