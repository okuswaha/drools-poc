package org.prakash.drools;

public class Person {
    private String name;
    private int time;
    private String greet;

    public Person() {
    }

    public Person(String name, int time) {
        this.name = name;
        this.time = time;
    }

    public String getGreet() {
        return greet;
    }
    public void setGreet(String greet) {
        this.greet = greet;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTime() {
        return time;
    }
    public void setTime(int time) {
        this.time = time;
    }


}
