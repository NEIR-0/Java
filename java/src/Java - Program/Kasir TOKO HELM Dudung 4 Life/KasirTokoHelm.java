/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihankasus_java;
import java.io.*;

public class KasirTokoHelm{
    public void array()throws IOException {
        InputStreamReader Keyreader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(Keyreader);
        
        int i,j,point;
        point = 1;
        
        double Total_Bayar = 0;
        double Total_Pajak = 0;
        double Total_Harga = 0;
        
        String[] jenis, ukuran, nama;
        int[] jumbel;
        double[] harga, jumhar, pajak;
        
        jenis = new String[10];
        ukuran = new String[10];
        jumbel = new int[10];
        harga = new double[10];
        jumhar = new double[10];
        pajak = new double[10];
        nama = new String[10];
        

        System.out.println("\n========================================================================================");
        System.out.println("\n                             TOKO HELM \"Dudung 4 Life\"");
        System.out.println("\n========================================================================================");
        System.out.print("Masukkan Jumlah Beli : "); j = Integer.parseInt(input.readLine());
        System.out.println("\n========================================================================================");
        System.out.println("");
        
        for (i=1; i<=j; i++){
            System.out.print("Barang ke - " + i);
            System.out.print("\nMerk Helm [KYT/BMC] : "); jenis[i] = input.readLine();
            if (jenis[i].equalsIgnoreCase("kyt")){
                point = 1;
            }
            else if (jenis[i].equalsIgnoreCase("bmc")){
                point =1;
            }
            else{
                System.out.println("\nAnda Salah kode !!!");
                System.out.println("");
                point = 0;
                break;          
            }
            System.out.print("Jumlah Beli         : "); jumbel[i] = Integer.parseInt(input.readLine());
            System.out.print("Ukuran              : "); ukuran[i] = input.readLine();
            System.out.println("");
            
            if (jenis[i].equalsIgnoreCase("KYT") && jenis[i].equalsIgnoreCase("kyt")){
                nama[i]="KYT";
                
                if (ukuran[i].equalsIgnoreCase("S") && ukuran[i].equalsIgnoreCase("s")){
                    harga[i] = 80000;
                }
                else if (ukuran[i].equalsIgnoreCase("M") && ukuran[i].equalsIgnoreCase("m"))
                {
                    harga[i] = 70000;
                }
                else if (ukuran[i].equalsIgnoreCase("L") && ukuran[i].equalsIgnoreCase("l")){
                    harga[i] = 60000;
                }
                else if (ukuran[i].equalsIgnoreCase("XL") && ukuran[i].equalsIgnoreCase("xl")){
                    harga[i] = 60000;
                }
                else if (ukuran[i].equalsIgnoreCase("XXL") && ukuran[i].equalsIgnoreCase("xxl")){
                    harga[i] = 60000;
                }
             
                else
                {
                    System.out.println("Kepala anda terlalu jaget !!!");
                    System.out.println("");
                    point = 0;
                    break;
                }

                
            }
            
            
            else if(jenis[i].equalsIgnoreCase("BMC") && jenis[i].equalsIgnoreCase("bmc")){
                    nama[i]="BMC";
                
                if (ukuran[i].equalsIgnoreCase("S") && ukuran[i].equalsIgnoreCase("s")){
                    harga[i] = 90000;
                }
                else if (ukuran[i].equalsIgnoreCase("M") && ukuran[i].equalsIgnoreCase("m")){
                    harga[i] = 85000;
                }
                else if (ukuran[i].equalsIgnoreCase("L") && ukuran[i].equalsIgnoreCase("l")){
                    harga[i] = 75000;
                }
                else if (ukuran[i].equalsIgnoreCase("XL") && ukuran[i].equalsIgnoreCase("xl")){
                    harga[i] = 75000;
                }
                else if (ukuran[i].equalsIgnoreCase("XXL") && ukuran[i].equalsIgnoreCase("xxl")){
                    harga[i] = 75000;
                }
             
                else
                {
                    System.out.println("Kepala anda terlalu jaget !!!");
                    System.out.println("");
                    point = 0;
                    break;
                }

            }

            
            jumhar[i] = harga[i]*jumbel[i];


        }
        
        if (point == 1){
            System.out.println("\n");
            System.out.println("\n========================================================================================");
            System.out.println("\n                             TOKO HELM \"Dudung 4 Life\"");
            System.out.println("\n========================================================================================");
            System.out.println("Data ke     " + "Jenis Helm     " + "Ukuran        " + "Harga          " + "Jumlah Beli        " + "Jumlah Harga       ");
            System.out.println("\n========================================================================================");
            System.out.println("");
        
        
        for(i=1; i<=j; i++){
            
            System.out.println("   "+i+"   " + "        "+nama[i] + "           "+ukuran[i] + "           "+ (int)harga[i] + "               "+(int)jumbel[i] + "                "+(int)jumhar[i]);
            
            pajak[i] = jumhar[i]*0.1;
            Total_Bayar = Total_Bayar + jumhar[i];
            Total_Pajak = Total_Pajak + pajak[i];
            Total_Harga = Total_Harga +jumhar[i]+pajak[i];
        }
        System.out.println("\n========================================================================================");
        System.out.println("");
        System.out.println("                                                     Total Bayar            : " + (int)Total_Bayar);
        System.out.println("                                                     Pajak                  : " + (int)Total_Pajak);
        System.out.println("                                                     =====================================");
        System.out.println("                                                     Harga Semuanya adalah  : " + Total_Harga);
        }
        
        else{
            System.out.println("");
        }
    }
}
