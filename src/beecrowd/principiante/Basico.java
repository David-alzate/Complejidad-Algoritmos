package beecrowd.principiante;

import java.util.Scanner;

public class Basico {

//    Leer 2 valores enteros y almacenarlos en variables, llamadas A y B , y sumarlas, asignando el resultado a la variable X.
//    Mostrar X como se muestra abajo. No muestre ningún mensaje además de lo quese especifica y no olvide imprimir un salto de
//    línea luego del resultado, de otra forma Ud. recibirá un “Presentation Error”.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int A = 0;
        int B = 0;
        int X = 0;

        A = reader.nextInt();
        B = reader.nextInt();
        X = A + B;
        System.out.println("X = "+ X);

    }
}
