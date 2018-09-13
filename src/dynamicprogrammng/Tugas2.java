/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogrammng;
import java.util.Scanner;
/**
 *
 * @author M. RAFI PUTRA
 */
public class Tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] jenisBarang = {"E","B","A","D","C"};
        int[] berat = {7, 5, 4, 3, 2};
        int[] bayaran = {10000, 7000, 5000, 3000, 2000};
        int[] pp = new int[5];
        int jumlahBayaran = 0;
        
        
        System.out.println("Masukkan berat barang: ");
        int beratBarang = scanner.nextInt();
        
        for(int k = 0; k < berat.length;k++ ) {
            if(beratBarang >= berat[k]) {
                pp[k] = beratBarang / berat[k];
                beratBarang = beratBarang % berat[k];
                jumlahBayaran = jumlahBayaran + pp[k]*bayaran[k];
                System.out.println("jenis barang: "+ jenisBarang[k]+" bayaran yang diperoleh: " +pp[k]*bayaran[k]);
            }
        }
        System.out.println("jumlah bayaran yang diperoleh: "+ jumlahBayaran);
        
    }
}
