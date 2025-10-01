import java.util.Scanner;

public class Solution {

    static void main(String[] args) {

        Scanner print = new Scanner(System.in);

        float gradosC = print.nextInt();

        float fahrenheit = gradosC * 9/5 + 32;
        float kelvin = gradosC + 273.15f;


        System.out.println("hola: " + fahrenheit);
        System.out.println("Kelvin: " + kelvin);

    }
}
