/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author ADMIN
 */
public class KiemTraAccout {
    public static void main(String[] args) {
        Account ac1,ac2;
        
        // tạo đối tượng
        
        ac1 = new Account("AC002","Tran Thanh Tuan",100000);
        
        // tạo đôi tượng 2
        ac2 = new Account("AC003","Tran Van A",200000);
        
        
        
        System.out.println("--- THONG TIN TAI KHOAN GIAO DICH ---");
        System.out.println("My Account:id:"+ac1.getId()+"-name: "+ac1.getName()+" "+ ac1.getBalance());
        System.out.println("My Account:id:"+ac2.getId()+"-name: "+ac2.getName()+" "+ ac2.getBalance());
        ac1.credit(100000);
        ac2.debit(50000);
        
       System.out.println("--- THONG TIN TAI KHOAN SAU KHI GIAO DICH ---");
       System.out.println("My Account:id:"+ac1.getId()+"-name: "+ac1.getName()+" "+ ac1.getBalance());
        System.out.println("My Account:id:"+ac2.getId()+"-name: "+ac2.getName()+" "+ ac2.getBalance());
        
        
        ac1.tranferTo(ac2, 20);
         System.out.println("--- THONG TIN TAI KHOAN SAU KHI CHUYEN TIEN ---");
         System.out.println("My Account:id:"+ac1.getId()+"-name: "+ac1.getName()+" "+ ac1.getBalance());
        System.out.println("My Account:id:"+ac2.getId()+"-name: "+ac2.getName()+" "+ ac2.getBalance());
        
    }
         
}
