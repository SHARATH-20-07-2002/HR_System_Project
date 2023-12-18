package hr_system;

public class HRSystemExample {
    public static void main(String[] args) {
        // Create HR System
        HRSystem hrSystem = new HRSystem();

        // Add employees
        Employee employee1 = new Employee("Sharath", 101, 50000);
        Employee employee2 = new Employee("SHARATH", 102, 60000);

        hrSystem.addEmployee(employee1);
        hrSystem.addEmployee(employee2);

        // Display employees
        hrSystem.displayEmployees();
    }
}


