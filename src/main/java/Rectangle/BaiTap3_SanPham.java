    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author trant
 */
public class BaiTap3_SanPham {

    public static ArrayList<SanPham> ds;

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int chon;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----- Chuong Trinh Quan Ly ----");
            System.out.println("1.Nhap Danh Sach San Pham");
            System.out.println("2.Xuat Danh Sach San Pham");
            System.out.println("3.Sap Xep Danh Sach San Pham");
            System.out.println("4.Xoa San Pham Theo Ten");
            System.out.println("5.Tinh Gia Trung Binh Cua Cac San Pham");
            System.out.println("0.Thoat");
            System.out.println("====================================");
            System.out.println("Chon Chuc Nang (0->5)");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhap();
                    break;
                case 2:
                    xuat();
                    break;
                case 3:
                    sapxep();
                    break;
                case 4:
                    xoa();
                    break;
                case 5:
                    xuatGiaTrungBinh();
                    break;

                default:
                    System.out.println("Hen Gap Lai Sau.GoodBye");
            }
        } while (chon!=0);
    }
    private static void nhap() {
       Scanner sc = new Scanner (System.in);
               String chon=" ";
               do {   
                   System.out.println("Nhap Thong Tin San Pham");
                   System.out.println("Ten SP:");
                   String ten = sc.nextLine();
                   System.out.println("Nhap Gia");
                   double gia = Double.parseDouble(sc.nextLine());
                   ds.add(new SanPham(ten,gia));
                   System.out.println("Tiep Tuc (Y/N");
                  chon=sc.nextLine();
        } while (!chon.equalsIgnoreCase("y"));
    }

    private static void xuat() {
         
    }

    private static void sapxep() {
       
    }

    private static void xoa() {
  
    }

    private static void xuatGiaTrungBinh() {
       
    }
}
