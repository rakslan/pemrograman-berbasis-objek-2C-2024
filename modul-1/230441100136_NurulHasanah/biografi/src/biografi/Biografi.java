/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biografi;

class bio {
    String nama;
    String asal;
    String hobby;
}
/**
 *
 * @author User
 */
public class Biografi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bio bioku = new bio();
        bioku.nama = "nurul hasanah";
        bioku.asal = "bangkalan";
        bioku.hobby = "gatau";
        System.out.println("halooo :"+bioku.nama);
        System.out.println("aku dari aja :"+bioku.asal);
        System.out.println("hobby ku :"+bioku.hobby);
    }
    
}
