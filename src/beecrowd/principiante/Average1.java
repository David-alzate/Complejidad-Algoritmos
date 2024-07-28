package beecrowd.principiante;

import java.util.Locale;
import java.util.Scanner;

public class Average1 {

//    Leer dos valores de punto flotante de doble precisión A y B, correspondiente a dos notas de estudiantes. Luego de esto, calcular el promedio
//    de los estudiantes, considerando que el peso de la nota A es 3.5 y el peso de la nota B es 7.5. Cada nota puede ser de cero a diez, siempre con
//    un dígito después del punto decimal. No se olvide de imprimir el final de línea luego del resultado, de lo contrario recibirá “Presentation Error”.
//    No se olvide del espacio antes y despues del signo igual.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);
        double A = 0;
        double B = 0;
        double MEDIA = 0;

        A = reader.nextDouble();
        B = reader.nextDouble();

        MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);
        System.out.printf("MEDIA = %.5f\n",MEDIA);

    }
}
