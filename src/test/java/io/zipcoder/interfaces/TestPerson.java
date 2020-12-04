package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void setNameTest() {
        //given
        Person person = new Person("");
        String expected = person.setName("David");

        //when
        String actual = person.getName();

        //then
        Assert.assertEquals(expected, actual);
    }

}
