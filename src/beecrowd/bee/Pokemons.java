package beecrowd.bee;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Pokemons {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> poquemones = poquemonesCapturados(n, scanner);
        System.out.println("Falta(m) " + catidadPoquemones(poquemones) + " pomekon(s).");
    }

    public static ArrayList<String> poquemonesCapturados(int cantidad, Scanner scanner){
        ArrayList<String> poquemones = new ArrayList<>();
        for (int i = 0; i < cantidad; i++){
            String nombre = scanner.nextLine().trim();
            poquemones.add(nombre);
        }
        return poquemones;
    }

    public static int catidadPoquemones(ArrayList<String> poquemonesCapturados){
        int cantidadPoquemones = 151;
        Set<String> poquemonesUnicos = new HashSet<>(poquemonesCapturados);
        int cantidadUnicos = poquemonesUnicos.size();
        return (cantidadPoquemones - cantidadUnicos);
    }
}