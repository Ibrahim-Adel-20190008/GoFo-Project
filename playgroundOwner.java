/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swe4;

/**
 *
 * @author Ahmed Abdelnaser
 */
public class playgroundOwner implements User {
    private String name,email,address, phone;

    /**
     *
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

    @Override
    public String toString() {
        return "PlayGroundOwner{" + "name=" + name + ", email=" + email + ", address=" + address + ", phone=" + phone + '}';
    }

    /**
     *
     * @return
     */
    
        
}
