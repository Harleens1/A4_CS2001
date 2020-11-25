//Class for the League
import java.util.ArrayList;

/**
 * The League class is supposed to create objects of type league.
 * It has a method setupLeague which creates three objects of type
 */
public class League
{
    // Instance variables include the name of the league and a list of
    // the divisions in the league.
    private String name;
    private ArrayList<Division> divisions; 

    /**
     * Constructor for objects of class League. Creates an ArrayList
     * with three divisions in it.
     */
    public League(String name)
    {
        // initialise instance variables
        this.name = name;
        divisions = new ArrayList<>(); 
        divisions.add(new Division("Division1"));
        divisions.add(new Division("Division2"));
        divisions.add(new Division("Division3"));
    }

    /**
     * The setupLeague method creates teams and adds them to the divisions
     * in the league.
     */
    public void setupLeague()
    {
        divisions.get(0).addTeam("Team1");
        divisions.get(0).addTeam("Team2");
        divisions.get(0).addTeam("Team3");
        divisions.get(0).addTeam("Team4");
        divisions.get(0).addTeam("Team5");
        divisions.get(1).addTeam("Team1");
        divisions.get(1).addTeam("Team2");
        divisions.get(1).addTeam("Team3");
        divisions.get(1).addTeam("Team4");
        divisions.get(1).addTeam("Team5");
        divisions.get(2).addTeam("Team1");
        divisions.get(2).addTeam("Team2");
        divisions.get(2).addTeam("Team3");
        divisions.get(2).addTeam("Team4");
        divisions.get(2).addTeam("Team5");   
        int players = 1; 
        int teams = 1;
        int div = 1;
        while(players<=12 && div<=3){
            divisions.get(div).getTeam(teams).addPlayer("player" + players, players); 
            int c = 0; 
            while(c<2){
                divisions.get(div).getTeam(teams).addCoach("Coach" + c, c);
            }
            players++; 
            if(players == 12){
                teams++; 
                players = 0; 
                if(teams==5){
                    div++; 
                    teams = 0;
                }
            }
        }
    } 
    
    public void addPlayer(String name, int i)
    {
        Player p = new Player(name, i);
    } 
    
    public void addCoach(String name, int i) 
    { 
        Coach c = new Coach(name, i);
    }
}
