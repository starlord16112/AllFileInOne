/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//nếu số lượng > 20 giảm 20%
//thiết kế ứng dụng destop
package W2E4P1;

/**
 *
 * @author DELL
 */
public class Supplier {
    private String NameS;
    private String Address;

   /* public String getNameS() {
        return NameS;
    }

    public String getAddress() {
        return Address;
    }*/

    public Supplier(String NameS, String Address) {
        this.NameS = NameS;
        this.Address = Address.substring(0, 3);
    }
    
   
    @Override
    public String toString()
    {
        String kq = "";
        kq += this.NameS + "\t" + this.Address;
        return kq;
    }
    
}
