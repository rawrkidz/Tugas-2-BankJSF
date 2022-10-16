/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;


public class InisialisasiSaldo {
    private int saldoUtama = 500000; 
    public int batassSaldo = 100000; 
    
    private static InisialisasiSaldo instance = new InisialisasiSaldo();

    public static InisialisasiSaldo getInstance() { 
        return instance; 
    }
    
    private InisialisasiSaldo(){}
    
    public int getSaldoUtama(){
        return saldoUtama;   
    } 
    
    public void setSaldoUtama(int saldoUtama){
        this.saldoUtama = saldoUtama;
    } 
}                                
