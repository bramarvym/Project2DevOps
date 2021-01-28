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
public class keretabiasa extends kereta{
    
    int pajak = 1500;
    int biayaadmin = 500;
    private int totalharga1;
    
    int harga(){
        totalharga1 = pajak + biayaadmin;
        return totalharga1;
    }
    
}
