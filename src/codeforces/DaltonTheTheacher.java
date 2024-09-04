package codeforces;

import java.util.Scanner;

public class DaltonTheTheacher {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int feli = 0;
        int infeli = 0;
        int [] array = new int[n];

        for (int i = 0; i < n; i++){
            array[i] = reader.nextInt();
        }

        for (int i = 0; i < n; i++){
            if (array[i] == i + 1){
                infeli = infeli + 1;
            }else {
                feli = feli + 1;
            }
        }

            System.out.println(infeli - 1);


    }





}
