package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestTechConnect {
    @Before
    public void setup() {
        TechConnect techConnect = new TechConnect();
        techConnect.removeStudents();

    }

    @Test
    public void tstRemoveStudents() {
        TechConnect techConnect = new TechConnect();
        techConnect.removeStudents();
        Assert.assertTrue((techConnect.getStudents()).isEmpty());
    }

    @Test
    public void testRecruitStudent() {
        TechConnect techConnect = new TechConnect();
        Student student1= new Student("David");
        Student student2= new Student("Stacey");
        techConnect.recruitStudent(student1);
        techConnect.recruitStudent(student2);
        Assert.assertFalse((techConnect.getStudents()).isEmpty());
    }

}
