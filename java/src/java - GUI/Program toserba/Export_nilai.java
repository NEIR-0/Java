/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_latihan2;

/**
 *
 * @author aalij
 */
public class Export_nilai {
    
   //String, int dan Double  dibawah bisa kita ubag variable namanya
   public String kode_barang,NBarang;
   public int JBeli, HBarang;
   public Double TotalBayar, UangBayar, Kembalian;
    
    //get and setter
   
    //bikin method baru
    public void setkode_barang(String val){
        kode_barang = val;
    }
    
    public String getkode_barang() {
        return kode_barang;
    }
    
    //bikin method baru
    public void setSeleksikode_barang(){
        if (kode_barang.equalsIgnoreCase("B001")){
            NBarang = "pensil";
            HBarang = 3000;
        }
        
        else if (kode_barang.equalsIgnoreCase("B002")){
            NBarang = "buku";
            HBarang = 5000;
        }
        
        else if (kode_barang.equalsIgnoreCase("B003")){
            NBarang = "penggaris";
            HBarang = 1000;
        }
        
        else if (kode_barang.equalsIgnoreCase("B004")){
            NBarang = "penghapus";
            HBarang = 500;
        }
        
        else{
            NBarang = "";
            HBarang = 0;
        }
    }
    
    //bikin method baru
    public void setNBarang(String val){
        NBarang = val;
    }
    
    public String getNBarang() {
        return NBarang;
    }
    
    //bikin method baru
    public void setJBeli(int val){
        JBeli = val;
    }
    
    public int getJBeli() {
        return JBeli;
    }
    
    //bikin method baru
    public void HBarang(int val){
        HBarang = val;
    }
    
    public int getHBarang() {
        return HBarang;
    }
    
    
    public Double getTotalBayar() {
       TotalBayar = (double)HBarang*JBeli;
       return(TotalBayar);
    }

    //bikin method baru
    public void setUangBayar(Double val){
        UangBayar=val;
    }
    
    public Double getUangBayar() {
        return UangBayar;
    }

    public Double getKembalian() {
        return(UangBayar-TotalBayar);
    }
   
}  