package ejercicios;

import java.util.Scanner;

public class Age {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int droAge = scanner.nextInt();
        int alyssaAge = scanner.nextInt();
        int konariAge = scanner.nextInt();

        for (int a = 1; a <= droAge; a++) {
            for (int k = 1; k <= droAge; k++) {
                if ((a * alyssaAge) + (k * konariAge) == droAge) {
                    System.out.println("1");
                    return;
                }
            }
        }

        System.out.println("0");
    }

}

//Dr. O has two granddaughters (named Alyssa and Konari) and they keep Dr. O young!
//When people ask Dr. O how old he is, rather than giving one positive integer (his age), Dr. O
//provides two positive integers a and k; Dr. O’s age can then be computed using the expression
//        (a × Alyssa’s age) + (k × Konari’s age).
//Given three positive integers (Dr. O’s age, Alyssa’s age, and Konari’s age), determine if the positive
//integers a and k exist.
//        Input
//There is only one input line; it provides (respectively) Dr. O’s age, Alyssa’s age, and Konari’s age. Assume
//that 1 ≤ Konari’s age < Alyssa’s age < Dr. O’s age ≤ 150.
//Output
//Print 1 (one) if a and k exist, 0 (zero) otherwise. Note that a and k must both be greater than zero