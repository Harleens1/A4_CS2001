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
        int p = 0; 
        int t = 0;
        int d = 0;
        while(p<12 && d<3){
            divisions.get(d).getTeam(t).addPlayer("player" + p, p); 
            int c = 0; 
            if(c<2){
                divisions.get(d).getTeam(t).addCoach("Coach" + c, c); 
                c++;
            }
            p++; 
            if(p == 11){
                t++; 
                p = 0; 
                if(t==4){
                    d++; 
                    t = 0;
                }
            }
        }
    } 
    
    // Revised setupLeague method.
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
        int p = 0; 
        int t = 0;
        int d = 0;
        while(p<=12 && d<3){
            divisions.get(d).getTeam(t).addPlayer("player" + p, p);
            p++; 
            if(p == 12){
                t++; 
                p = 0; 
                if(t==4){
                    d++; 
                    t = 0;
                }
            }
        }
        int c = 0;
        t = 0;
        d = 0;
        while(c<2 && d<3){
            divisions.get(d).getTeam(t).addCoach("Coach" + c, c);
            c++;
            if(c == 2){
                t++;
                c = 0;
                if(t == 4){
                    d++;
                    t = 0;
                }
            }
        }
    } 
    // revised method ends.
    
    public void addPlayer(String name, int i)
    {
        Player p = new Player(name, i);
    } 
    
    public void addCoach(String name, int i) 
    { 
        Coach c = new Coach(name, i);
    } 
    
    public String getLeagueName() 
    {
        return name;
    }
    
}
