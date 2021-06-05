import java.util.ArrayList;

/**
 *
 * @author Ibrahim_Adel
 */
public class registeredUser {

    /**
     * create ArrayList for store data of Players
     */
    public  ArrayList<Player> Players=new ArrayList<>();

    /**
     * create ArrayList for store data of PlayGroundOwners
     */
    public  ArrayList<playgroundOwner> PlayGroundOwners=new ArrayList<>();

    /**
     * default constructor 
     */
    public registeredUser() {
    }

    /**
     * parameter constructor to insert player into ArrayList
     * @param player
     */
    public registeredUser(Player player) {
        Players.add(player);
    }

    /**
     * parameter constructor to insert playground owner into ArrayList
     * @param playgroundowner
     */
    public registeredUser(playgroundOwner playgroundowner) {
        PlayGroundOwners.add(playgroundowner);
    }

    /**
     * to add new player into ArrayList
     * @param player
     */
    public void addNewUser(Player player)
    {
        Players.add(player);
    }

    /**
     * to add new playground owner into ArrayList
     * @param playgroundowner
     */
    public void addNewUser(playgroundOwner playgroundowner)
    {
        PlayGroundOwners.add(playgroundowner);
    }
}
