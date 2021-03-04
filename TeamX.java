import java.util.*;

public class TeamX{

    List<Person> team = new ArrayList<>();

    Iterator it = team.iterator();


    public void setTeam(String name, int age, String role){
        team.add(new Person(name, age, role));
    }

    public void getTeam(){ // Prints all the objects of the list
        for(Person tmpName : team){
            System.out.println("Name : " + tmpName.getName() + " | " + "Age : " +tmpName.getAge() + " | " + "Role : " + tmpName.getRole() );
        }
    }

    public void hasRole(String role){ // Method that prints out all objects with the specified attribute "role".
        System.out.println("The people that are clasified as " + role + " are : " + '\n');
        if(it.hasNext()){
            for(Person tmpName : team){
                if(tmpName.getRole()==role){
                    System.out.println("Name : " + tmpName.getName() + " | " + "Age : " +tmpName.getAge() + " | " + "Role : " + tmpName.getRole() );
                }
            }
        }
    }

}