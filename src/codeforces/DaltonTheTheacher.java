package codeforces;

import java.util.Scanner;

public class DaltonTheTheacher {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int t = reader.nextInt();

        for (int test = 0; test < t; test++) {
            int n = reader.nextInt();
            int infeli = 0;
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = reader.nextInt();
            }

            for (int i = 0; i < n; i++) {
                if (array[i] == i + 1) {
                    infeli++;
                }
            }

            if (infeli == 0) {
                System.out.println(0);
            } else {
                System.out.println(1 + (infeli - 1) / 2);
            }
        }

        reader.close();
    }
}
