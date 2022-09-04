/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latiahn1;

/**
 *
 * @author aalij
 */
public class export {
    //menggunakan getter dan setter pada variable dibawah dari GUI design Latihan1.java
    public double nilai1, nilai2, hasil;

    public double getNilai1() {
        return nilai1;
    }

    public void setNilai1(double nilai1) {
        this.nilai1 = nilai1;
    }

    public double getNilai2() {
        return nilai2;
    }

    public void setNilai2(double nilai2) {
        this.nilai2 = nilai2;
    }

    public double getHasil() {
//        return hasil;
    //bagian atas kita ganti dengan rumus yang kita mau sebagai hasil
        return ((nilai1+nilai2)/2);
    }
    
    //bagian ini dihapus
//    public void setHasil(double hasil) {
//        this.hasil = hasil;
//    }
}    
    