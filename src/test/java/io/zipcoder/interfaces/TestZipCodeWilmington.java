package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Before
    public void setup(){
        ZipCodeWilmington zipCode = new ZipCodeWilmington();
        zipCode.fireStaff();
    }

    @Test
    public void testFireStaff(){
        ZipCodeWilmington zipCode = new ZipCodeWilmington();
        Assert.assertTrue((zipCode.getInstructors()).isEmpty());
    }

    @Test
    public void testHireStaff(){
        ZipCodeWilmington zipCode = new ZipCodeWilmington();
        Instructor instructor = new Instructor("David");
        zipCode.hire(instructor);
        Assert.assertFalse((zipCode.getInstructors()).isEmpty());
    }
}
