/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pertemuanke_7;

import java.util.Arrays;
/**
 *
 * @author jirya
 */
public class Pertemuanke_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//            int[] array1 = {7,4,1,3,6,4,3};
//            int[] array2 = new int[5];
//            System.arraycopy(array1, 1, array2, 2, 3);
//            System.out.println("Array 1 : ");
//            for(int i : array1){
//                System.out.println(i+ " ");
//            }
//           
//            System.out.println("Array 2 : ");
//            for (int i : array2){
//                System.out.println(i+"");
//            }
java.util.Scanner baca = new java.util.Scanner(System.in);
        int[][] matriks=new int[3][3]; 
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                System.out.println("Masukkan angka : " );
                int x = baca.nextInt();
                matriks[i][j] = x;
            }
        }
         System.out.println("Matriks 3x3:");
        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
