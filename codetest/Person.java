package codetest;

public class Person {
    private String name;
    private int age;

    public Person() {
    }
    // 有参构造，getter，setter
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }


}
