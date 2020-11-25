
/**
 * The Match class creates a scoreboard for a match between two teams.
 * Each match is played until one team wins 3 sets. A set is won by the
 * team which reaches 21 points first. If the match reaches the 5th set,
 * the team which reaches 15 points first wins. (Side note, this means
 * that the maximum number of points a team can earn is 97, assuming that
 * they lose two sets with 20 points, win two sets with 21 points, and then
 * win the final set with 15 points.)
 */
public class Match
{
    // instance variables - replace the example below with your own
    private Team home;
    private Team away; 
    private int setsWonHT; 
    private int setsWonAT;

    /**
     * Constructor for objects of class match
     */
    public Match(Team home, Team away)
    {
        // initialise instance variables
        setsWonHT = 0; 
        setsWonAT = 0;
        home = home;
        away = away;
    } 
    
    public void game(int set1hometeampoints, int set2hometeampoints,
    int set3hometeampoints, int set4hometeampoints, int set5hometeampoints,
    int set1awayteampoints, int set2awayteampoints, int set3awayteampoints, 
    int set4awayteampoints, int set5awayteampoints)
    { 
        if (set1hometeampoints == 21){
            setsWonHT ++;
        } else if(set1awayteampoints == 21){
            setsWonAT ++;             
        } 
        if (set2hometeampoints == 21){
            setsWonHT ++;
        } else if(set2awayteampoints == 21){
            setsWonAT ++;             
        } 
        if (set3hometeampoints == 21){
            setsWonHT ++;
        } else if(set3awayteampoints == 21){
            setsWonAT ++;             
        }
        if (set4hometeampoints == 21){
            setsWonHT ++;
        } else if(set4awayteampoints == 21){
            setsWonAT ++;             
        } 
        if (set5hometeampoints == 15){
            setsWonHT ++;
        } else if(set5awayteampoints == 21){
            setsWonAT ++;             
        }
    }   
          
    public int getsetsWonHomeTeam() 
    {
        return setsWonHT;
    } 
    
    public int getsetsWonAwayTeam() 
    {
        return setsWonAT;
    }        
        
    public int getsetsWonHomeTeam() 
    {
        return setsWonHT;
    } 
    
    public int getsetsWonAwayTeam() 
    {
        return setsWonAT;
    }
      
            
}
