import java.util.ArrayList;

/**
 * The Division class creates divisions. Each division has a name, a list
 * of teams, and a list of matches between teams of that division.
 */
public class Division
{
    // instance variables - replace the example below with your own
    private String name;
    private ArrayList<Team> teams;
    private ArrayList<Match> matches;

    /**
     * Constructor for objects of class Division
     */
    public Division(String name)
    {
        this.name = name;
        teams = new ArrayList<>();
        matches = new ArrayList<>();
    }

    /**
     * This method adds a team to the division.
     */
    public void addTeam(String teamName)
    {
        teams.add(new Team(teamName));
    }
    
