/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AtmModel;  
import jakarta.enterprise.context.RequestScoped;
import jakarta.faces.bean.ManagedBean;   

@ManagedBean (name = "AtmWeb")      
@RequestScoped   

public class AtmController { 
    
    private AtmModel model;   
    private int jumlah;    

    public AtmController(){
        model = new AtmModel();  
    }
    
    public int getJumlah() {
        return jumlah; 
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah; 
    }
    
    public int AksesSaldo() {  
        return model.lihatSaldo();  
    } 
    
    public String getNextTarikUang() {   
         if(model.cekBatasSaldo()){
            return "Saldo Yang Anda Miliki Sudah Mencapai Batas Minimal !!!"; 
        } else if((model.lihatSaldo()- jumlah)< model.limitSaldo()){
            return "Jumlah Uang Yang Ditarik Melebihi Besar Saldo Yang Anda Miliki !!!";  
        } else if((model.lihatSaldo()> jumlah) && (model.cekProses(jumlah) == 1)){
            model.tarikUang(jumlah);  
            return "Uang Berhasil Ditarik";   
        } else{
            return "Tarik Uang Gagal Karena Tidak Kelipatan 50000";   
        }         
    }     
 
    public String getNextSetorUang() {   
        if(model.cekProses(jumlah)==1){
            model.setorUang(jumlah);              
            return "Uang Berhasil Disetor";   
        } else{
            return ("Setor Uang Gagal Karena Tidak Kelipatan 50000 !!!");     
        }  
    }  
}                                                           
         