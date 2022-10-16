/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Dao.AtmDao;

public class AtmModel implements AtmDao{

    InisialisasiSaldo saldo;     
    
    public AtmModel(){
        this.saldo = InisialisasiSaldo.getInstance();   
    }
    
    public int limitSaldo(){
        return this.saldo.batassSaldo; 
    } 
    
    @Override
    public int lihatSaldo() { 
        return this.saldo.getSaldoUtama();
    }  
    
    @Override
    public void tarikUang(int jumlah) {
        saldo.setSaldoUtama(saldo.getSaldoUtama() - jumlah); 
    }
    
    @Override 
    public void setorUang(int jumlah) { 
        saldo.setSaldoUtama(saldo.getSaldoUtama() + jumlah);      
    }        
    
    @Override
    public boolean cekBatasSaldo() {
        if(this.saldo.getSaldoUtama() <= this.saldo.batassSaldo){
            return true;
        } else {
            return false;   
        }
    }      

    @Override
    public int cekProses(int jumlah) { 
        if(jumlah % 50000 == 0){
            return 1;
        } else {
            return 0;
        } 
    }
}      
             