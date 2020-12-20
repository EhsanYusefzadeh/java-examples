
import java.util.Arrays;



/*
* My Error was because of my not private defining attributes
* */

public class Course {
    // ------------------- Properties --------------------
    private int registeredStudents = 0;
    private String name = "";
    private Student[] students = new Student[10];
    // --------------- End of Properties -----------------

    // ------------------ Constructors -------------------
    public Course(){
        this.name = "";
    }
    public Course(String name){
        this.name = name;
    }
    public Course(Student[] students) {
        this();
        this.students = students;
        registeredStudents = students.length;
    }
    public Course(String name, Student[] students) {
        this.name = name;
        this.students = students;
        registeredStudents = students.length;
    }
    // ---------- End of Constructors ---------------


    // ------------------ Setters -------------------
    public void setStudents(Student[] students) {
        this.students = students;
        this.registeredStudents = students.length;
    }
    public void setName(String name) {
        this.name = name;
    }
    // ---------------- End of Setters --------------


    // ----------------- Getters --------------------
    public String getName() {
        return this.name;
    }
    public int getNumOfStudents() {
        return registeredStudents;
    }
    public Student[] getStudents() {
        return Arrays.copyOfRange(this.students, 0, registeredStudents);
    }
    // ---------- End of Getters --------------------

    public boolean register(Student s) {
        if(registeredStudents < 10){
            students[registeredStudents] = s;
            registeredStudents++;
            return true;
        }
        return false;
    }
}