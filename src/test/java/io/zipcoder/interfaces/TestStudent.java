package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student student = new Student("David");
        Assert.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        Student student = new Student("David");
        Assert.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        Student student = new Student("David");
        double expected = 50.0;
        student.learn(expected);
        double actual = student.getTotalStudyTime();
        Assert.assertEquals(expected,actual,0.000001);
    }


}
