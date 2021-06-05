

/**
 *
 * @author abdallah mohamed
 */
public class Player implements User{
    
        private String name,email,address, phone;

    /**
     *
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
     *
     * @param name pass the player name
     */
        @Override
    public void setName(String name){
        this.name=name;
        }

        /**
     *
     * @param email pass the player email
     */
        @Override
    public void setEmail(String email){
            this.email=email;
        }

  /**
     *
     * @param address pass the player address
     */
        @Override
    public void setAddress(String address){
            this.address=address;
        }    

     /**
     *
     * @param phone pass the player phone number
     */
    @Override
    public void setPhone(String phone) {
        this.phone=phone;
    }


     /**
     *
     * @return name
     */
        @Override
    public String getName(){
            return name;
        }

    /**
     *
     * @return email
     */
        @Override
    public String getEmail(){
            return email;
        }

    /**
     *
     * @return address
     */
        @Override
    public String getAddress(){
            return address;
        }    

    /**
     *
     * @return phone
     */
        @Override
    public String getPhone(){
            return phone;
        }

    /**
     *
     * @return
     */
    @Override
        public String toString() {
            String info = "\nname:" + getName()  
                +"\nEmail:"+getEmail()
                +"\nAddress:"+getAddress()
                +"\nphone:"+getPhone();
                    return info;
	}
        
}
