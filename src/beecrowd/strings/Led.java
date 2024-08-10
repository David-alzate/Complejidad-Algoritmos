package beecrowd.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Led {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++){
            String  v = scanner.nextLine().trim();
            System.out.println(calcularNumeroLeds(v) + " leds");
        }
    }

    public static int calcularNumeroLeds(String numero) {
        Map<String, Integer> map = new HashMap<>();

        map.put("1", 2);
        map.put("2", 5);
        map.put("3", 5);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", 3);
        map.put("8", 7);
        map.put("9", 6);
        map.put("0", 6);

        int suma = 0;

        for (int i = 0; i < numero.length(); i++) {
            int digito = Character.getNumericValue(numero.charAt(i));
            suma += map.get(Integer.toString(digito));
        }
        return suma;
    }
}

//John wants to set up a panel containing different numbers of LEDs. He does not have many leds, he is not sure if
//he will be able to mount the desired number. Considering the configuration of the LEDs of the numbers below,
//make an algorithm that helps John to discover the number of LEDs needed to set the value.
//        Note: For Javascript programmers, it is recommended to use of "input.trim().split('\n')" to avoid some known
//problems.

//Input
//The input contains an integer N, (1 ≤ N ≤ 2000) corresponding to the number of test cases, followed by N lines,
//each line containing a number (1 ≤ V ≤ 10 ) corresponding to the value that John wants to set with the leds.

//Output
//For each test case, print one line containing the number of LEDs that John needs to set the desired value,
//followed by the word "leds".