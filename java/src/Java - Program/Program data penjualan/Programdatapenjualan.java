/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soalarray;
import java.io.*;
/**
 *
 * @author user
 */
public class Programdatapenjualan {
    public static void main(String[] args)throws IOException {
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(input);
        
        int i, j;
        double total = 0;
        String nama, tanggal;
        String[] kodebar, nambar;
        int[] jumlah, hargabar, jumbar;
        
        nambar = new String[10];
        kodebar = new String[10];
        jumlah = new int[10];
        hargabar = new int[10];
        jumbar = new int[10];
        
        
        System.out.println("                           PT. PERMATA \"PRAMATA\" ");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
        
        System.out.print("Masukkan Nama Petugas : ");
        nama = br.readLine();
        System.out.print("Tanggal               : ");
        tanggal = br.readLine();
        System.out.print("");
        
        System.out.print("\nJumlah Data yang akan di masukkan    : ");
        j = Integer.parseInt(br.readLine());
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        for (i=1; i<=j; i++){
            System.out.println("                  Data Ke - " + i);
            System.out.print("                  Kode Barang : ");
            kodebar[i] = br.readLine();
            System.out.print("                  Jumlah      : ");
            jumlah[i] = Integer.parseInt(br.readLine());
            System.out.println("");
            
            if (kodebar[i].equalsIgnoreCase("P001") && kodebar[i].equalsIgnoreCase("p001")){
                nambar[i] = "Printer    ";
                hargabar[i] = 700000;    
            }
            
            else if (kodebar[i].equalsIgnoreCase("V001") && kodebar[i].equalsIgnoreCase("v001")){
                nambar[i] = "VGA Card    ";
                hargabar[i] = 75000; 
            }
            
            else if (kodebar[i].equalsIgnoreCase("M001") && kodebar[i].equalsIgnoreCase("m001")){
                nambar[i] = "Motherboard";
                hargabar[i] = 950000; 
            }
            
            else{
                System.out.println("Anda salah kode !!!");
                break;
            }
            
        jumbar[i] = jumlah[i]*hargabar[i];
        total = total+jumbar[i];
        
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        System.out.println("\n\n");
        System.out.println("\n                                       PT. PERMATA \"PRAMATA\" ");
        System.out.println("+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
        System.out.println("Nama Petugas                  : " + nama + "                                                 Tanggal  : " + tanggal);
        System.out.println("Jumlah Data yang di masukkan  : " + j);
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.println("Data ke        " + "kode Barang        " + "Nama Barang        " + "Harga Barang        " + "Jumlah Barang        " + "Total harga");
        System.out.println("");
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        
        for (i=1; i<=j; i++){
            System.out.println("   "+i+"  " + "            "+kodebar[i] + "            "+nambar[i] + "           "+hargabar[i] + "                 "+jumlah[i] + "                "+jumbar[i]);
        }
        
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");        
        System.out.println("\nTotal Pendapatan pada Tanggal " + tanggal + " adalah sebesar Rp. " + total + "\n");
    }
    
}
