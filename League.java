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
    
    /**
     * This method displays the standings of the teams within the division
     * at the specified index.
     */
    public void divisionStanding(int index)
    {
        //code goes here
        divisions.get(index).calculateStanding();
    }
    
    /**
     * This method adds a match to the division of the league at the
     * specified index. Matches are between two teams of a division.
     * If a team did not gain any points in a given set, enter 0. HT and
     * AT are the index values of the two teams.
     */
    public void divisionMatch(int index, int HT, int AT, int HTpointsSet1, 
    int ATpointsSet1, int HTpointsSet2, int ATpointsSet2, int HTpointsSet3, 
    int ATpointsSet3, int HTpointsSet4, int ATpointsSet4, int HTpointsSet5, 
    int ATpointsSet5)
    {
        //code goes here
        divisions.get(index).addMatch(HT, AT, HTpointsSet1, ATpointsSet1, 
        HTpointsSet2, ATpointsSet2, HTpointsSet3, ATpointsSet3, 
        HTpointsSet4, ATpointsSet4, HTpointsSet5, ATpointsSet5);
    }
    
}
