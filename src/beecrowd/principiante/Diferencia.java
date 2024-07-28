package beecrowd.principiante;

import java.util.Locale;
import java.util.Scanner;

public class Diferencia {

//    Leer cuatro valores enteros A, B, C y D. Calcular e imprimir la diferencia entre el producto de A y B, y el producto de C y D (A * B - C * D).

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);
        int A = 0;
        int B = 0;
        int C = 0;
        int D = 0;
        int DIFERENCA = 0;

        A = reader.nextInt();
        B = reader.nextInt();
        C = reader.nextInt();
        D = reader.nextInt();

        DIFERENCA = ((A * B) - (C * D));
        System.out.println("DIFERENCA = " + DIFERENCA);

    }
}
