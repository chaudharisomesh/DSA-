package Learning.DSA_Assignment1;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n, min = 0.0;
        System.out.print("Enter a number: ");
        n = in.nextDouble();
        min = n;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter a number: ");
            n = in.nextDouble();
            if (n < min) {
                min = n;
            }
        }
        System.out.println("Smallest number is: " + min);
    }
    }


