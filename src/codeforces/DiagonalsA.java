package codeforces;

import java.util.*;

public class DiagonalsA {

    public static int[] calcularDiagonalesOcupadas(int cantidadCasos, int[][] casosDePrueba) {
        int[] resultados = new int[cantidadCasos];

        for (int i = 0; i < cantidadCasos; i++) {
            int tamano = casosDePrueba[i][0];
            int chips = casosDePrueba[i][1];

            if (chips == 0) {
                resultados[i] = 0;
                continue;
            }

            int diagonalesOcupadas = 0;
            int chipsRestantes = chips;

            for (int longitud = tamano; longitud > 0; longitud--) {
                if (chipsRestantes <= 0) {
                    break;
                }
                if (longitud == tamano) {
                    diagonalesOcupadas++;
                    chipsRestantes -= tamano;
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
            int tamano = scanner.nextInt();
            int chips = scanner.nextInt();
            casosDePrueba[i] = new int[]{tamano, chips};
        }

        int[] resultados = calcularDiagonalesOcupadas(cantidadCasos, casosDePrueba);

        for (int resultado : resultados) {
            System.out.println(resultado);
        }

        scanner.close();
    }
}
