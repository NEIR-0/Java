/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latScanner2;
/**
 *
 * @author user
 */
public class Homepage {
    public static void main(String[] args) {
        
    //membuat objeck baru
    HitungNilaiRata scan = new HitungNilaiRata();
    
    scan.InputScanner();
        System.out.print("\n=================================\n");
        System.out.println("\nNama Anda : " + scan.getnama());
        System.err.println("        nilai 1     : " + scan.n1);
        System.err.println("        nilai 2     : " + scan.n2);
        System.out.print("                    ___________ =\n");
        System.out.println("        rata-rata   : " + scan.rata());
        System.out.print("\n=================================\n");

    }
    
}
