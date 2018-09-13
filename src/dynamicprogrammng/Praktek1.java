/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogrammng;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author M. RAFI PUTRA
 */
public class Praktek1 {

    /**
     * @param args the command line arguments
     */
   
    private static void tampilJudul(String identitas) {
        System.out.println("identitas : "+ identitas);
        
        System.out.println("\nHitung Fibonacci");
        System.out.println("1, 1, 2, 3, 5, 8, 13, 21 ... dst.\n");
    }
    
    private static int tampilInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bilangan ke-1 ");
        int n = scanner.nextInt();
        
        return n;
    }
    
    private static BigInteger Fibo(int n) {
        BigInteger[] hasil = new BigInteger[n];
        
        hasil[0] = BigInteger.ONE;
        hasil[1] = BigInteger.ONE;
        
        for(int i = 2; i<n; i++) {
            hasil[i] = hasil[i-1].add(hasil[i-2]);
        }
        
        return hasil[n-1];
    }
    
    private static void tampilHasil(int n, BigInteger hasil) {
         System.out.println("Bilangan fibonacci ke-"+n+" : "+ hasil);
    }
    
    public static void main(String[] args) {
            // TODO code application logic here
            String identitas = "nama lengkap / kelas / no";
            
            tampilJudul(identitas);
            int n = tampilInput();
            BigInteger hasil = Fibo(n);
            tampilHasil(n, hasil);
              
        }
    
}
