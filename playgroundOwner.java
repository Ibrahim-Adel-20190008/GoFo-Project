import java.util.ArrayList;
public class playgroundOwner implements User {

    /**
     * to store name of playgroundOwner
     */
    private String name;

    /**
     * to store email of playgroundOwner
     */
    private String email;

    /**
     * to store address of playgroundOwner
     */
    private String address; 
    
    /**
     * to store address of playgroundOwner
     */
    private String phone;

    /**
     * to store all playgrounds of playgroundOwner
     */
    public ArrayList<Playground> PlayGrounds;
    

    /**
     * parametric constructor
     * @param name pass the owner name
     * @param email pass the owner email
     * @param address pass the owner address
     * @param phone pass the owner phone number
     */
    public playgroundOwner(String name,String email,String address,String phone){
            this.name=name;
            this.email=email;
            this.phone=phone;
            this.address=address;
            PlayGrounds = new ArrayList<>();
            
        }

    /**
     *
     * @param name pass the owner name
     */
        @Override
    public void setName(String name){
        this.name=name;
        }

    /**
     *
     * @param email pass the owner email
     */
        @Override
    public void setEmail(String email){
            this.email=email;
        }

    /**
     *
     * @param address pass the owner address
     */
        @Override
    public void setAddress(String address){
            this.address=address;
        }    

    /**
     *
     * @param phone pass the owner phone number
     */
    @Override
    public void setPhone(String phone) {
        this.phone=phone;
    }


    /**
     *
     * @return name of playgroundOwner
     */
        @Override
    public String getName(){
            return name;
        }

    /**
     *
     * @return email of playgroundOwner
     */
        @Override
    public String getEmail(){
            return email;
        }

    /**
     *
     * @return address of playgroundOwner
     */
        @Override
    public String getAddress(){
            return address;
        }    

    /**
     *
     * @return phone of playgroundOwner
     */


    @Override
    public String getPhone(){
            return phone;
        }
    
    /**
     * to add new Playground to his Owner
     * @param Playground1
     * 
     */
    
    public void addPlayground(Playground Playground1){
        PlayGrounds.add(Playground1);
    }

    /**
     * This function book the playground 
     * @param startTime
     * @param numOfhours
     * @param indexOfplayground
     */
    public void Booking(int startTime,int numOfhours,int indexOfplayground)
    {
        int numOfhours1=numOfhours;
        int f;
        for(int i=0;i<12;i++)
        {
            if(PlayGrounds.get(indexOfplayground).hours[i]==startTime ||PlayGrounds.get(indexOfplayground).hours[i]==startTime*-1)
            {
                f=i;
                while(numOfhours>1)
                {
                    if(PlayGrounds.get(indexOfplayground).hours[i+1]>0)
                    {
                    i++;
                    numOfhours--;
                    }
                    else {
                        System.out.println("your Booking is rejected");
                        return;
                    }
                }
                numOfhours=numOfhours1;
                i=f;
                if(PlayGrounds.get(indexOfplayground).hours[i]<0) PlayGrounds.get(indexOfplayground).hours[i]=0;
                else PlayGrounds.get(indexOfplayground).hours[i]=PlayGrounds.get(indexOfplayground).hours[i]*-1;
                if(PlayGrounds.get(indexOfplayground).hours[i+numOfhours]<0) PlayGrounds.get(indexOfplayground).hours[i+numOfhours]=0;
                else PlayGrounds.get(indexOfplayground).hours[i+numOfhours]=PlayGrounds.get(indexOfplayground).hours[i+numOfhours]*-1;
                while(numOfhours>1)
                {
                    PlayGrounds.get(indexOfplayground).hours[i+1]=0;
                    i++;
                    numOfhours--;
                }
                break;
            }
        } 
        System.out.println("your Booking is accepted");
    }
 /**
     *
     * @return all values of playgroundOwner
     */
    @Override
    public String toString() {
        return "playgroundOwner{" + "name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone + '}';
    }
    
    /**
     *
     * @print all values of playgroundOwner and his Playgrounds
     */
    public void Display()
    {
       System.out.print(toString());
        for(int i=0 ;i<PlayGrounds.size() ;i++)
           System.out.println(PlayGrounds.get(i).display()); 
    }    
}
