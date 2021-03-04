import java.util.*;

public class Main{
    public static void main(String[] args){
    
        TeamX company = new TeamX();

        company.setTeam("Person One", 18, "Intern Software Developer");
        company.setTeam("Person Two", 28, "Senior Software Engineer");
        company.setTeam("Persone Three", 22, "Junior Software Developer");
        company.setTeam("Person Four", 31, "Senior Software Engineer");
        
        company.getTeam();

        System.out.println('\n');

        company.hasRole("Senior Software Engineer");

    } 
}