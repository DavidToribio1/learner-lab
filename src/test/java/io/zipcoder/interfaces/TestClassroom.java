package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestClassroom {

    @Test
    public void testGetRosterInstructors(){
        ArrayList<Person> instructors = new ArrayList();
        instructors.addAll(ZipCodeWilmington.getInstructors());
        HashMap<String, Person> expected = new HashMap();
        for (Person p : instructors){
            expected.put(p.getName(), p);

        }
        HashMap<String,Person> actual = Classroom.getRoster(instructors);
        Assert.assertEquals(expected,actual);
    }
}
