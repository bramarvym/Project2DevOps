/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package commuterreservation;

/**
 *
 * @author Bram
 */

//inheritance from the class kereta.java
public class keretabiasa extends kereta{
    
    int pajak = 1500;
    int biayaadmin = 500;
    private int totalharga1;
    
    //get harga
    int harga(){
        totalharga1 = pajak + biayaadmin;
        return totalharga1;
    }
    
}
