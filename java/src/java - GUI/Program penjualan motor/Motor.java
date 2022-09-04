/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_latihan3;

public class Motor {
    public String nama, merk, pilihan, jenis;
    public double harga, diskon, total; 

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    //metohd baru
    public void setMerk(String val){
        merk = val;
    }
    
    //method baru
    public void setSeleksiHarga(){
        //decision merk
        if (merk.equalsIgnoreCase("HONDA")){
            diskon = 0;
            if(pilihan.equalsIgnoreCase("BEBEK")){
                harga = 10000000;
            }
            else if(pilihan.equalsIgnoreCase("MATIC")){
                harga = 13000000;
            }
            else if(pilihan.equalsIgnoreCase("SPORT")){
                harga = 16000000;
            }
            else{
                harga = 0;
            }
        }
        else if (merk.equalsIgnoreCase("YAMAHA")){
            diskon = 0;
            if(pilihan.equalsIgnoreCase("BEBEK")){
                harga = 12000000;
            }
            else if(pilihan.equalsIgnoreCase("MATIC")){
                harga = 15000000;
            }
            else if(pilihan.equalsIgnoreCase("SPORT")){
                harga = 18000000;
            }
            else{
                harga = 0;
            }
        }
        
        else{
            diskon = 0;
            harga = 0;
        }
    }
    public String getMerk(){
        return merk;
    }
    
    //method baru
    public void setPilihan(String val){
        pilihan = val;
    }
    
    public String getPlilihan(){
        return pilihan;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public Double getHarga() {
        return harga;
    }
    
    //method baru
    public Double getDiskon() {
        //decision diskon
        if (pilihan.equalsIgnoreCase("BEBEK")){
            diskon = harga*0.05;
        }
        else if (pilihan.equalsIgnoreCase("MATIC")){
            diskon = harga*0.03;
        }
        else if (pilihan.equalsIgnoreCase("SPORT")){
            diskon = harga*0.01;
        }
        else{
            diskon = 0;
        }
        return diskon;
    }

    public void setDiskon(Double diskon) {
        this.diskon = diskon;
    }

    public Double getTotal() {
        //rumus harga total
        total = harga-diskon;
        return total;
    }


    
}
