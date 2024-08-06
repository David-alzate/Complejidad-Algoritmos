package codeforces;

import java.util.*;

public class DiagonalsA {

    public static int[] calcularDiagonalesOcupadas(int cantidadCasos, int[][] casosDePrueba) {
        int[] resultados = new int[cantidadCasos];

        for (int i = 0; i < cantidadCasos; i++) {
            int tamaño = casosDePrueba[i][0];
            int chips = casosDePrueba[i][1];

            if (chips == 0) {
                resultados[i] = 0;
                continue;
            }

            int diagonalesOcupadas = 0;
            int chipsRestantes = chips;

            for (int longitud = tamaño; longitud > 0; longitud--) {
                if (chipsRestantes <= 0) {
                    break;
                }
                if (longitud == tamaño) {
                    diagonalesOcupadas++;
                    chipsRestantes -= tamaño;
                } else {
                    if (chipsRestantes > 0) {
                        diagonalesOcupadas++;
                        chipsRestantes -= longitud;
                    }
                    if (chipsRestantes > 0) {
                        diagonalesOcupadas++;
                        chipsRestantes -= longitud;
                    }
                }
            }

            resultados[i] = diagonalesOcupadas;
        }

        return resultados;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidadCasos = scanner.nextInt();
        int[][] casosDePrueba = new int[cantidadCasos][2];

        for (int i = 0; i < cantidadCasos; i++) {
            int tamaño = scanner.nextInt();
            int chips = scanner.nextInt();
            casosDePrueba[i] = new int[]{tamaño, chips};
        }

        int[] resultados = calcularDiagonalesOcupadas(cantidadCasos, casosDePrueba);

        for (int resultado : resultados) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}
