// Student.java

public class Student {

    // Private attributes

    private String firstName;

    private String lastName;

    private int studentID;

    private String dateOfBirth;

    // Constructor

    public Student(String firstName, String lastName, int studentID, String dateOfBirth) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.studentID = studentID;

        this.dateOfBirth = dateOfBirth;

    }

    // Method to get full name

    public String getFullName() {

        return firstName + " " + lastName;

    }

    // Main method to test the class

    public static void main(String[] args) {

        // Creating a Student object

        Student student1 = new Student("John", "Doe", 12345, "1/2/2003");

        // Printing the full name

        System.out.println("Full Name: " + student1.getFullName());
    }
}

// Primarily displays Student name
// Use of object-orientedness