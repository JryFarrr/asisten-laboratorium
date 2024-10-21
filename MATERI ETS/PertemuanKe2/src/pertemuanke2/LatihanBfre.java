/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanke2;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class LatihanBfre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Masukkan nama anda : ");
        BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        String nama = baca.readLine( );
        System.out.println("Nama anda adalah : " + nama);
    }
    
}
