
public class Player implements User{
    
    /**
     * to store name of player
     */
    private String name;

    /**
     * to store email of player
     */
    private String email;

    /**
     * to store address of player
     */
    private String address; 
    
    /**
     * to store address of player
     */
    private String phone;

    /**
     * parametric constructor
     * @param name
     * @param email
     * @param address
     * @param phone
     */
    public Player(String name,String email,String address,String phone){
            this.name=name;
            this.email=email;
            this.phone=phone;
            this.address=address;
 
        }

    /**
     * default constructor
     */
    public Player() {
    }
    
    /**
     *
     * @param player
     */
    Player(Player player) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * to assign name of player
     * @param name
     */
        @Override
    public void setName(String name){
        this.name=name;
        }

    /**
     * to assign email of player
     * @param email
     */
        @Override
    public void setEmail(String email){
            this.email=email;
        }

    /**
     * to assign address of player
     * @param address
     */
        @Override
    public void setAddress(String address){
            this.address=address;
        }    

    /**
     * to assign phone of player
     * @param phone
     */
    @Override
    public void setPhone(String phone) {
        this.phone=phone;
    }


    /**
     *
     * @return the name of player
     */
        @Override
    public String getName(){
            return name;
        }

    /**
     *
     * @return the email of player
     */
        @Override
    public String getEmail(){
            return email;
        }

    /**
     *
     * @return the address of player
     */
        @Override
    public String getAddress(){
            return address;
        }

    /**
     * This function book the playground 
     * @param startTime
     * @param numOfhours
     * @param Person
     * @param indexOfPlayground
     */
    public void Booking(int startTime,int numOfhours,playgroundOwner Person,int indexOfPlayground)
    {
        System.out.println("pending...");
        Person.Booking(startTime, numOfhours, indexOfPlayground);
    }
    /**
     *
     * @return the phone number of player
     */
        @Override
    public String getPhone(){
            return phone;
        }

    /**
     *
     * @return all data for player
     */
    @Override
        public String toString() {
            String info = "\nname:" + getName()  
                +"\nEmail:"+getEmail()
                +"\nAddress:"+getAddress()
                +"\nphone:"+getPhone();
                    return info;
	}

    /**
     * To display all Playgrounds for player to choose which Playground he want book him
     * @param Playgrounds
     */
    public void viewingPlayground(registeredPlayground Playgrounds)
    {
        Playgrounds.viewingPlayground();
    }
}
