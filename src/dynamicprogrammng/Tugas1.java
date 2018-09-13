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
public class Tugas1 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        System.out.println("jumlah uang = ");
        int uang = baca.nextInt();
        
        int pecahan[] = new int[]{5000,2000,1000,500,100};
        int jumlah[] = new int[5];
        
        for(int i = 0; i < pecahan.length;i++) {
            if(uang >= pecahan[i]) {
                jumlah[i] = uang / pecahan[i];
                uang = uang % pecahan[i];
                System.out.println("pecahan " + pecahan[i]+ " sebanyak "  +jumlah[i]+  " keping ");
            } 
        }
 
    }
}
