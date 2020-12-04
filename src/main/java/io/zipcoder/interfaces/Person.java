package io.zipcoder.interfaces;

public class Person {
    private Person person;
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }


}


