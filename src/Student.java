


public class Student {

    // Private fields

    private String studentId;

    private String firstName;

    private String lastName;

    private int age;

    private String major;



    // Default constructor

    public Student() {

        this.studentId = "";

        this.firstName = "";

        this.lastName = "";

        this.age = 0;

        this.major = "";

    }



    // Parameterized constructor

    public Student(String studentId, String firstName, String lastName, int age, String major) {

        this.studentId = studentId;

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;

        this.major = major;

    }



    // Getter and Setter methods

    public String getStudentId() {

        return studentId;

    }



    public void setStudentId(String studentId) {

        this.studentId = studentId;

    }



    public String getFirstName() {

        return firstName;

    }



    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }



    public String getLastName() {

        return lastName;

    }



    public void setLastName(String lastName) {

        this.lastName = lastName;

    }



    public int getAge() {

        return age;

    }



    public void setAge(int age) {

        this.age = age;

    }



    public String getMajor() {

        return major;

    }



    public void setMajor(String major) {

        this.major = major;

    }



    // toString method

    @Override

    public String toString() {

        return "Student ID: " + studentId + ", Name: " + firstName + " " + lastName +

                ", Age: " + age + ", Major: " + major;

    }

}















import java.util.ArrayList;

import java.util.List;



public class StudentEnrollment {

    public static void main(String[] args) {

        // Creating a list of Student objects

        List<Student> students = new ArrayList<>();



        // Creating student objects with parameterized constructor

        Student student1 = new Student("12345", "John", "Doe", 20, "Computer Science");

        Student student2 = new Student("23456", "Jane", "Smith", 21, "Mathematics");

        Student student3 = new Student("34567", "Bob", "Johnson", 19, "Physics");



        // Adding students to the list

        students.add(student1);

        students.add(student2);

        students.add(student3);



        // Printing the details of each student using the toString method

        for (Student student : students) {

            System.out.println(student);

        }



        // Updating the major of student1 and printing the updated information

        student1.setMajor("Data Science");

        System.out.println("\nUpdated Major for " + student1);

    }

}

