/*1. Create a class that captures students. Each student has a first name, last name, class year, and
major. Create two examples of students.*/
import java.util.*;
class Student {

    String fname;
    String lname;
    int  classyear;

    // constructor
    Student() {
        fname = "Unknown";
         lname = "Unknown";

         classyear= 0;
     
    }

    void setDetails(String n, String m, int a) {
        fname = n;
        lname = m;
       
        classyear = a;
    }

    void printDetails() {
        System.out.println("My name is " + fname  +  lname  + " and my  class year is " +  classyear);
    }
}

class Test {

    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        st1.setDetails("Pravin", " Nikam ", 10);
        st2.setDetails("Arjun", " Patil", 12);

        st1.printDetails();
        st2.printDetails();
    }
}