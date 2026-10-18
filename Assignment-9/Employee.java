//Write a java program to create a class known as Person with methods called getFirstName() and getLastName(). Create a subclass called Employee that adds a new method named getEmployeeId() and overrides the getLastName() method to include the employee's job title.

class Person {
    String firstName;
    String lastName;

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return lastName;
    }
}

class Employee extends Person {
    int employeeId;
    String jobTitle;

    int getEmployeeId() {
        return employeeId;
    }

    String getLastName() {
        return lastName + " - " + jobTitle;
    }

    public static void main(String[] args) {
        Employee e = new Employee();

        e.firstName = "Pranav";
        e.lastName = "Sharma";
        e.employeeId = 101;
        e.jobTitle = "Manager";

        System.out.println("First Name: " + e.getFirstName());
        System.out.println("Last Name: " + e.getLastName());
        System.out.println("Employee ID: " + e.getEmployeeId());
    }
}
