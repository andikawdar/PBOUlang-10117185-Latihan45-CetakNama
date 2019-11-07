/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan45.cetaknama;
import java.util.Scanner;
/**
 *
 * @author user
 * Nama  : Andhyka Widariyanto
 * NIM   : 10117185
 * Kelas : PBO - Ulang
 * Tugas : Latihan 45 - Cetak Nama
 */
public class PBOUlang10117185Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner masukan = new Scanner(System.in);
    Printer dapat = new Printer();
    
        System.out.println("=====Aplikasi Pencetak Nama=====");
        System.out.print("Masukan nama anda : ");
            String inNama = masukan.next();
        System.out.print("Mau cetak berapa kali? : ");
            int inCetak = masukan.nextInt();
    
        dapat.setNama(inNama);
        dapat.setJmlCetak(inCetak);
        dapat.cetak(dapat.getNama());
        dapat.cetak(dapat.getJmlCetak(), dapat.getNama());
                    
    }
    
}
