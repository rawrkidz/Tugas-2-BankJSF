package ATM; 

public class Tampilan  
 {     
    public static Tampilan instance = new Tampilan();
    
    public Tampilan(){}
    
    public static Tampilan getInstance() {
        return instance;
    }
    
   public void TampilMassage1(String message){  
     System.out.print(message);  
   }
   
   public void TampilMassage2(String message){  
     System.out.println(message);   
   }
   
   public void TampilSaldo(int jumlah){  
     System.out.println(jumlah);   
   }
 }  
  