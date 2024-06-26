/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hitungluassegitiga;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class HitungLuasSegitiga {

    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan nilai alas
        System.out.print("Masukkan nilai alas segitiga: ");
        double alas = scanner.nextDouble();
        
        // Meminta pengguna untuk memasukkan nilai tinggi
        System.out.print("Masukkan nilai tinggi segitiga: ");
        double tinggi = scanner.nextDouble();
        
        // Menghitung luas segitiga
        double luas = (alas * tinggi) / 2;
        
        // Menampilkan hasil perhitungan
        System.out.println("Luas segitiga adalah: " + luas);
        
        // Menutup scanner
        scanner.close();
    }
}