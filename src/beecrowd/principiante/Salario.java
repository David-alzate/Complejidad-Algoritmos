package beecrowd.principiante;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

//    Escribe un programa que lea un número de empleado, su número de horas trabajadas en el mes y el monto recibido por hora.
//    Imprimir el número de empleado y el salario que él/ella recibirá a fin de mes, con dos lugares decimales.
//
//    No se olvide de imprimir los saltos de líneas después del resultado, de lo contrario, recibirá “Presentation Error”.
//    No se olvide del espacio en blanco antes y después del signo igual y después de U$.

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        reader.useLocale(Locale.US);
        int numeroEmpleado = 0;
        int numeroHorasTrabajadas = 0;
        float montoHora = 0;
        float salario = 0;

        numeroEmpleado = reader.nextInt();
        numeroHorasTrabajadas = reader.nextInt();
        montoHora = reader.nextFloat();

        salario = numeroHorasTrabajadas * montoHora;

        System.out.println("NUMBER = " + numeroEmpleado);
        System.out.printf("SALARY = U$ %.2f\n", salario);
    }
}
