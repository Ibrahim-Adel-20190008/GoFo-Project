/**
 *
 * @author abdallah mohamed
 */

import java.util.ArrayList;

public class registeredPlayground {
    /**
     *  ArrayList for store playground data
     */
    public  ArrayList<Playground> Playgrounds=new ArrayList<>();

    /**
     * default constructor 
     */
    public registeredPlayground () {
    }

    /**
     * parameter constructor to add playground in ArrayList
     * @param playground
     */
    public registeredPlayground(Playground playground ) {
        Playgrounds.add(playground );
    }

    /**
     * add new playground in ArrayList
     * @param player
     */
    public void addNewPlayground(Playground playground )
    {
        Playgrounds.add(playground);
    }
    
}
