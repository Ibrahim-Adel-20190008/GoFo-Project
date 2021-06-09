
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        playgroundOwner playgroundOwner_1 =new playgroundOwner("Ahmed","ahmed@gmail","Embaba","753");
        Playground Playground_1= new Playground("El_7reef",100);
        Playground Playground_2= new Playground("El_Lord",200);
        registeredPlayground Playgrounds = new registeredPlayground();
        Player Player_1=new Player("Ibrahim","ibrahim_23@gmail.com","elwraq","011");
        
        // to registerPlayground in System
        Playgrounds.addNewPlayground(Playground_1);
        Playgrounds.addNewPlayground(Playground_2);
        
        // to assign playgrounds to playgroundOwner
        playgroundOwner_1.addPlayground(Playground_1);
        playgroundOwner_1.addPlayground(Playground_2);
        
        // Display all Playgrounds for player
        System.out.println("All Playgrounds are Available");
        Player_1.viewingPlayground(Playgrounds);
        
        // Booking playground
        Player_1.Booking(2, 3, playgroundOwner_1, 1);
        Player_1.Booking(1, 2, playgroundOwner_1, 1);
        
    }
    
}
