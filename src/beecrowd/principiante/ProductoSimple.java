package beecrowd.principiante;

import java.util.Scanner;

public class ProductoSimple {

//    Leer dos valores enteros. Luego, calcular el producto entre ellos y guardar el resultado en una variable llamada PROD.
//    Imprimir el resultado como se muestra en los ejemplos.No olvides imprimir el final de línea luego del resultado, de
//    otra forma recibirás “Presentation Error”.

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int PROD = 0;

        A = reader.nextInt();
        B = reader.nextInt();
        PROD = A * B;

        System.out.println("PROD = "+ PROD);
    }
}
