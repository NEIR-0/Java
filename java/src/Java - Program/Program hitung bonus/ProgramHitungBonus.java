/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package IfElifElse;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class ProgramHitungBonus {
    public static void main(String[] args) {
        int pendapatan;
        double jasa, komisi , total;
    
    //deskripsi objek
    Scanner input = new Scanner(System.in);
    
    System.out.println("\n==================================\n");
    System.out.println("        Perhitungan Bonus");
    System.out.println("\n==================================");
    System.out.print("Masukkan pendapatan : ");
    pendapatan = input.nextInt();
    
    if (pendapatan >= 0 && pendapatan <=200000){
        jasa = 10000;
        komisi = 0.1*pendapatan; 
    }
    else if (pendapatan <= 500000){
        jasa = 20000;
        komisi = 0.15*pendapatan;
    }
    else{
        jasa = 30000;
        komisi = 0.2*pendapatan;
    }
    
    //menghitung total
    total = komisi+jasa;
        System.out.println("\n----------------------------------");
        System.out.println("\nBonus yang didapatkan:");    
        System.out.println("    uang jasa       Rp. " + (int) jasa);
        System.out.println("    uang komisi     Rp. " + (int) komisi);
        System.out.println("                    _______________+");
        System.out.println("    Uang TOtal      Rp. " + (int) total);
        System.out.println("==================================");

    }
}
