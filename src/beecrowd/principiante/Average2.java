package beecrowd.principiante;

import java.util.Locale;
import java.util.Scanner;

public class Average2 {

//    Leer tres valores (variables A, B y C), que son las tres notas de estudiantes. Entonces, calcule el promedio, considerando que la nota A
//    tiene peso 2, la nota B tiene peso 3 y la nota C tiene peso 5. Cosiderar que cada nota puede ser del 0 al 10.0, siempre con un punto decimal.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);
        double A = 0;
        double B = 0;
        double C = 0;
        double MEDIA = 0;

        A = reader.nextDouble();
        B = reader.nextDouble();
        C = reader.nextDouble();

        MEDIA = ((A * 2.0) + (B * 3.0) + (C * 5.0)) / (2 + 3 + 5);
        System.out.printf("MEDIA = %.1f\n",MEDIA);

    }
}
