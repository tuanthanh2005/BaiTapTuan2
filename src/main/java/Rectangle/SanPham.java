/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rectangle;

/**
 *
 * @author trant
 */
class SanPham {
    private String ten;
    private double gia;

    // Constructor
    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    // Getter cho thuộc tính ten
    public String getTen() {
        return ten;
    }

    // Setter cho thuộc tính ten
    public void setTen(String ten) {
        this.ten = ten;
    }

    // Getter cho thuộc tính gia
    public double getGia() {
        return gia;
    }

    // Setter cho thuộc tính gia
    public void setGia(double gia) {
        this.gia = gia;
    }

    // Phương thức toString để in thông tin sản phẩm
    @Override
    public String toString() {
        return "Tên: " + ten + ", Giá: " + gia;
    }
}