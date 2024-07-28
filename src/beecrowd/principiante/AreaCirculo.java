package beecrowd.principiante;

import java.util.Locale;
import java.util.Scanner;

public class AreaCirculo {

//    La fórmula para calcular el Área de un Círculo se define como: area = pi . radio2. Para este problema consideramos pi = 3.14159:
//    - Calcule el área usando la fórmula dada en la descripción del problema.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);
        double radio = 0;
        double pi = 3.14159;
        double area = 0;

        radio = reader.nextDouble();
        area = (pi * radio * radio);
        System.out.printf("A=%.4f\n",area);

    }
}
