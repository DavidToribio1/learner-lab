package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor instructor = new Instructor("David");
        Assert.assertTrue(instructor instanceof Teacher);

    }
    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor("David");
        Assert.assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor("David");
        Student student = new Student("John");
        double expected = 18;
        instructor.teach(student,expected);
        double actual = new student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.00001);
    }
    @Test
    public void testLecture(){
        Instructor instructor = new Instructor("David");
        Student student1 = new Student("Micheal");
        Student student2 = new Student("John");
        Student student3 = new Student("Dora");
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        double expected = 0 + 10;
        instructor.lecture(students,30);
        double actual = student1.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.00001);
    }



}
