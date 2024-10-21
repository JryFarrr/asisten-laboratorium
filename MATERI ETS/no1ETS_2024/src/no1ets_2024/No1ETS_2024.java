package no1ets_2024;
import java.util.Scanner;

class No1ETS_2024 {
   public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of data points: ");
        int n = scanner.nextInt();
        while(n > 0){
            System.out.println(n);
            n--;
        }
   }
}
