/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author ADMIN
 */
public class Account {
    private String id;
    private String name;
    private int balance;

    public Account() {
        
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    
    public void credit( int amout){
        balance += amout;
    }
    public void debit (int amout){
        if (balance>= amout) {
            balance-=amout;
            System.out.println("Rut tien thanh cong");
        }else
            System.out.println("Rut tien that bai");
    }
    public void tranferTo(Account Other, int amout){
        if (balance>=amout) {
            balance-=amout;
            Other.balance+=amout;
            System.out.println("Chuyen Thanh Cong");
        }else
            System.out.println("Chuyen That Bai");
    }
    
    
          
}
