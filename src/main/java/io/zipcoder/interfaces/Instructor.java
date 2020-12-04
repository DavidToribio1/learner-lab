package io.zipcoder.interfaces;

public class Instructor extends Person implements Teacher {

    public Instructor(String name){
        super(name);
    }


    public void lecture(Student[] student, double numberOfHours){
        double numOfHoursPerStudent  = numberOfHours/student.length;
        for (Student s : student){
            s.learn(numOfHoursPerStudent);
        }
    }

    public void teach(Student student, double numOfHours) {
        student.learn(numOfHours);
    }
}
