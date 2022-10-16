/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;


public interface AtmDao {
    int lihatSaldo();
    
    int cekProses(int jumlah);
    
    boolean cekBatasSaldo();
    
    void setorUang(int jumlah);
    
    void tarikUang(int jumlah);
    
}                              
