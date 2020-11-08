/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan37.programrataratanilai;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Program Rata-Rata Nilai
 */

public class PBO0610119916Latihan37ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.print ("Masukan Banyaknya Mahasiswa: ");
        Nilai val = new Nilai();
         
        Scanner masuk = new Scanner(System.in);
 
        val.banyak_mahasiswa = masuk.nextInt();
        val.hitungRataRata();
    }
    
}
