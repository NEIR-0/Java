/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testDebugging;

/**
 *
 * @author aalij
 */
public class Rumah {
    public String lokasi,jog,swim,gym,cara;
    public double hrg=0, hrg_j=0, hrg_s=0, hrg_g=0, biaya=0,total=0;
    
    //method baru
    public void setLokasi(String val){
        lokasi = val;
    }
    
    public String getLokasi() {
        return lokasi;
    }
    
    //method baru
    public void setSeleksilok(){
        if (lokasi.equalsIgnoreCase("BLOK A")){
            hrg=20000000;
        }
        else if (lokasi.equalsIgnoreCase("BLOK B")){
            hrg=30000000;
        }
        else if (lokasi.equalsIgnoreCase("BLOK C")){
            hrg=40000000;
        }
        else{
            hrg=0;
        }
    }

    
    //method baru
    public void setJog(String val){
        jog=val;
    }
    public double getJog(){
        if(jog.equalsIgnoreCase("Jogging track")){
            hrg_j=00000;
        }
        else{
            hrg_j=0;
        }
        
        return hrg_j;
    }
    
    //method baru
    public void setSwim(String val){
        swim=val;
    }
    
    //method baru
    public double getSwim(){
        if (swim.equalsIgnoreCase("Swimming pool")){
            hrg_s=200000;
        }
        else{
            hrg_s=0;
        }
        
        return hrg_s;
    }


    //method baru
    public void setGym(String val){
        gym=val;
    }
    
    public double getGym(){
        if (gym.equalsIgnoreCase("Gymnasium")){
            hrg_g=300000;
        }
        else{
            hrg_g=0;
        }
        
        return hrg_g;
        
    }

    //method baru
    public void setCara(String val){
        cara=val;
    }
    
    public String getCara(){
        return cara;
    }
    
    public void setSeleksiCara(){
        if (cara.equalsIgnoreCase("BTN")){
            biaya=100000;
        }
        else if(cara.equalsIgnoreCase("Other Bank")){
            biaya=50000;
        }
        else{
            biaya=0;
        }
        
    }
    
    public double getHrg() {
        return hrg;
    }
//
//    public void setHrg(double hrg) {
//        this.hrg = hrg;
//    }
//
//    public double getHrg_j() {
//        return hrg_j;
//    }
//
//    public void setHrg_j(double hrg_j) {
//        this.hrg_j = hrg_j;
//    }
//
//    public double getHrg_s() {
//        return hrg_s;
//    }
//
//    public void setHrg_s(double hrg_s) {
//        this.hrg_s = hrg_s;
//    }
//
//    public double getHrg_g() {
//        return hrg_g;
//    }
//
//    public void setHrg_g(double hrg_g) {
//        this.hrg_g = hrg_g;
//    }

    public double getBiaya() {
        return biaya;
    }
//
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }

    public double getTotal() {
        return (hrg+hrg_j+hrg_s+hrg_g+biaya);
    }

//    public void setTotal(double total) {
//        this.total = total;
//    }

}
