// Assignment2_CollegePortal.java

// Abstract class Person
abstract class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract String getRole();
}

// Interface Login
interface Login {
    boolean login(String username, String password);
}

// Concrete class Student
class Student extends Person implements Login {
    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Student";
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(id) && password.equals("studentpass"); // Sample login logic
    }
}

// Concrete class Faculty
class Faculty extends Person implements Login {
    public Faculty(String name, String id) {
        super(name, id);
    }

    @Override
    public String getRole() {
        return "Faculty";
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals(id) && password.equals("facultypass"); // Sample login logic
    }
}

// Main class to demonstrate Assignment 2
public class collegePortal {
    public static void main(String[] args) {
        Person rajashri = new Student("rajashri", "s101");
        Login studentLogin = (Login) rajashri; // Polymorphic behavior

        if (studentLogin.login("s101", "studentpass")) {
            System.out.println("Student Login Successful");
            System.out.println("Role: " + rajashri.getRole());
            System.out.println("Name: " + rajashri.name);
            System.out.println("ID: " + rajashri.id);
        } else {
            System.out.println("Student Login Failed");
        }
        System.out.println();
    }
}
