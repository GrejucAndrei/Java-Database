import java.util.*;

public class Person{
    
    private String name;
    private int age;
    private String role;

    Person(){
        this.name=null;
        this.age=0;
    }

    Person(String name, int age, String role){
        this.name=name;
        this.age=age;
        this.role=role;
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setRole(String role){
        this.role=role;
    }
    public String getRole(){
        return this.role;
    }
}