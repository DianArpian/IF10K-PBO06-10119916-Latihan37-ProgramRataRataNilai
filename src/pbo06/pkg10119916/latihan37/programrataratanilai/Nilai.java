/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan37.programrataratanilai;

import java.util.Scanner;

/**
 *
 * @author Thinkpad
 */
public class Nilai {
    
     public int i, banyak_mahasiswa;
   public float jum, nilai_mahasiswa, rata;
   
   public void hitungRataRata(){
       Scanner masuk = new Scanner(System.in);
        jum=0;
        i=1;
        while (i<=banyak_mahasiswa){
                System.out.print ("Nilai Mahasiswa ke-"+i+": ");
                nilai_mahasiswa = masuk.nextFloat ();
                jum += nilai_mahasiswa;
                i++;
        }
        rata = jum / banyak_mahasiswa;
        System.out.println ();
        System.out.println ("Maka, Rata-rata Nilainya adalah "+rata);        
        System.out.println ("Delevoped by : Dian Arpian ");
   }
}
