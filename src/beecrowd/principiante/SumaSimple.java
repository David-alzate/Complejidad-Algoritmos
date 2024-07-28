package beecrowd.principiante;

import java.util.Scanner;

public class SumaSimple {

//    Leer dos valores enteros, en este caso, las variables A y B. Luego, calcule la suma entre estos y asígnelo a
//    otra variable SOMA. Muestre el valor de esta variable.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int SOMA = 0;

        A = reader.nextInt();
        B = reader.nextInt();
        SOMA = A + B;

        System.out.println("SOMA = "+ SOMA);
    }
}
