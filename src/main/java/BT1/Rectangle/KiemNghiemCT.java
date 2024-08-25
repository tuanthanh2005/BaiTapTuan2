/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT1.Rectangle;

import java.awt.Rectangle;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class KiemNghiemCT {
    public static void main(String[] args) {
        
    
    BT1_Rectangle r1;
    BT1_Rectangle r2;
    
    r1 =new BT1_Rectangle();
    
    
    Scanner sc =new Scanner (System.in);
        System.out.println("Nhap Chieu Dai: ");
        double dai = sc.nextDouble();
        System.out.println("Nhap Chieu rong: ");
        double rong = sc.nextDouble();
        
        r2 = new BT1_Rectangle(dai, rong);
        System.out.println("Thong tin HCN thu 1");
        System.out.println(""+"Dai"+r1.getLength()+"Rong"+r1.getWidth()+"Dien tich"+r1.findArea()+"Chu Vi:"+r1.findPerimeter());
        System.out.println("Thong tin HCN thu 2:");
        System.out.println(""+"Dai"+r2.getLength()+"Rong"+r2.getWidth()+"Dien tich"+r2.findArea()+"Chu Vi:"+r2.findPerimeter());
        
    }
}
