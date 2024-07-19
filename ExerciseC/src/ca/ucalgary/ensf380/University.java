package ca.ucalgary.ensf380;

/*
 * University.java
 * Lab3_ExC
 * Submission Date: July 18, 2024
 * @author Manbir Briar
 * @version 1.3
 */


public class University {
	//Scenario
	public static void main(String[] args) {
        // Create a sample address
        Address address = new Address("12 Ave NW", "Calgary", "AB", "T4G 8L5", "Canada");

        // Create a professor
        Professor professor1 = new Professor("10", 100000.0);
        professor1.setName("Dr. Tom");
        professor1.setPhoneNumber("999-999-9999");
        professor1.setEmailAddress("tom@ucalgary.ca");
        professor1.setAddress(address);

        // Create a student who is eligible to enroll
        // No Address
        Student student1 = new Student("1", professor1, 90.5);
        student1.setName("Grace");
        student1.setPhoneNumber("111-111-1111");
        student1.setEmailAddress("grace@ucalgary.ca");
        

        // Create a student who is not eligible to enroll
        Student student2 = new Student("2", professor1, 45.0);
        student2.setName("James");
        student2.setPhoneNumber("222-222-2222");
        student2.setEmailAddress("james@ucalgary.ca");
        student2.setAddress(address);

        // Print information
        printProfessorInfo(professor1);
        printStudentInfo(student1);
        printStudentInfo(student2);
        
        
    }

    private static void printProfessorInfo(Professor professor) {
        System.out.println("Professor Information:");
        System.out.println("Name: " + professor.getName());
        System.out.println("Phone: " + professor.getPhoneNumber());
        System.out.println("Email: " + professor.getEmailAddress());
        if (professor.hasValidAddress()) {
            Address address = professor.getAddress();
            System.out.println("Address: " + address.getStreet() + ", " +
                    address.getCity() + ", " + address.getState() + ", " +
                    address.getPostalCode() + ", " + address.getCountry());
        } else {
            System.out.println("Address: Not provided");
        }
        System.out.println("Teacher Number: " + professor.getTeacherNumber());
        System.out.println("Salary: $" + professor.getSalary());
        System.out.println();
    }

    private static void printStudentInfo(Student student) {
        System.out.println("Student Information:");
        System.out.println("Name: " + student.getName());
        System.out.println("Phone: " + student.getPhoneNumber());
        System.out.println("Email: " + student.getEmailAddress());
        if (student.hasValidAddress()) {
            Address address = student.getAddress();
            System.out.println("Address: " + address.getStreet() + ", " +
                    address.getCity() + ", " + address.getState() + ", " +
                    address.getPostalCode() + ", " + address.getCountry());
        } else {
            System.out.println("Address: Not provided");
        }
        System.out.println("Student Number: " + student.getStudentNumber());
        System.out.println("Supervisor: " + student.getSupervisor().getName());
        System.out.println("Average Mark: " + student.getAverageMark());
        System.out.println("Eligible to Enroll: " + (student.isEligibleToEnroll() ? "Yes" : "No"));
        System.out.println();
	}
}
