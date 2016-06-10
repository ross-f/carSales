class Employee {
    private String firstName, lastName, department;
    private int payrollNumber;
    private double salary;
    private boolean privileged;

    // Constructor for generic user/employee creation
    Employee(String firstName, String lastName, String department, int payrollNumber,
             double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payrollNumber = payrollNumber;
        this.salary = salary;
    }

    // Constructor for elevated user/employee creation e.g. hr or management
    Employee(String firstName, String lastName, String department, int payrollNumber,
             double salary, boolean privileged) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.payrollNumber = payrollNumber;
        this.salary = salary;
        this.privileged = privileged;
    }
}
