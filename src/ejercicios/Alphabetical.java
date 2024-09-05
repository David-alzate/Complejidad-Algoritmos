package ejercicios;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Alphabetical {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        map.put("E", 5);
        map.put("F", 6);
        map.put("G", 7);
        map.put("H", 8);
        map.put("I", 9);
        map.put("J", 10);
        map.put("K", 11);
        map.put("L", 12);
        map.put("M", 13);
        map.put("N", 14);
        map.put("O", 15);
        map.put("P", 16);
        map.put("Q", 17);
        map.put("R", 18);
        map.put("S", 19);
        map.put("T", 20);
        map.put("U", 21);
        map.put("V", 22);
        map.put("W", 23);
        map.put("X", 24);
        map.put("Y", 25);
        map.put("Z", 26);

        String nombre = scanner.nextLine().trim();
        ArrayList<Integer> posicionesPalabras = new ArrayList<>();

        for (int i = 0; i < nombre.length(); i++) {
            char letra = nombre.charAt(i);
            char letraMayuscula = Character.toUpperCase(letra);
                Integer posicion = map.get(String.valueOf(letraMayuscula));

                posicionesPalabras.add(posicion);
        }

        boolean estaEnOrdenAscendente = true;
        boolean estaEnOrdenDesendente = true;

        for (int i = 0; i < posicionesPalabras.size() - 1; i++) {
            if (posicionesPalabras.get(i) > posicionesPalabras.get(i + 1)) {
                estaEnOrdenAscendente = false;
                break;
            }
        }

        for (int i = 0; i < posicionesPalabras.size() - 1; i++) {
            if (posicionesPalabras.get(i) < posicionesPalabras.get(i + 1)) {
                estaEnOrdenDesendente = false;
                break;
            }
        }

        if (estaEnOrdenAscendente || estaEnOrdenDesendente){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}