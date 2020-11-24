import java.util.*; 
import java.util.stream.Collectors;
/**
 * Write a description of class Team here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Team
{
    // instance variables - replace the example below with your own
    private String name; 
    private ArrayList<String> Team; 
    /**
     * Constructor for objects of class Team
     */
    public Team(String name)
    {
        // initialise instance variables 
        Team = new ArrayList<>();
        this.name = name;               
    } 
    
    public String getTeamName()
    {
        return name; 
    } 
    
    public void addPlayer(String player) 
    {
        Team.add(player);
    } 
    
    public void removePlayer(String player) 
    {
        if(Team.contains(player) != true){
            System.out.println("The player you entered is not on the team");
        }else{
            Team.remove(player); 
        }
    }
    
    public void printPlayers() 
    { 
        System.out.println(Team.stream().map(i -> i.toString()).collect(Collectors.joining(",")));
    }
}
