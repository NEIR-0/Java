/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latScanner2;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class HitungNilaiRata {
    public String nama;
    public double n1;
    public int n2;
    Scanner input = new Scanner(System.in);
    
public String getnama(){
    return nama;   
    }

public void InputScanner(){
    System.out.print("=================================\n");
    System.out.print("\n     HITUNG NILAI RATA-RATA\n");
    System.out.print("\n=================================\n");

    System.out.print("masukkan nama anda : ");
    nama = input.nextLine();
    System.out.print("masukkan nilai 1 : ");
    n1 = input.nextDouble();
    System.err.print("masukkan nilai 2 : ");
    n2 = input.nextInt();
}

public double rata(){

return ((n1+n2)/2);    
}
}