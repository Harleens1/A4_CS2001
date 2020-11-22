

/**
 * The Player class is supposed to create objects of type Player.
 * That is to say that the player class creates distincit objects
 * for each player of each team within the volleyball league.
 *
 * @author (Thomas Sheppard)
 * @version (v1)
 */
public class Player
{
    // Class instance variables. Name is the name of the player and id
    // is the number associated with that player.
    private String name;
    private int id;
    
    /**
     * Creates a player with the associated name and id number.
     */
    public Player(String name, int id)
    {
        // initialise instance variables
        this.name = name;
        this.id = id;
    }
}
