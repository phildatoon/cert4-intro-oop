/* Datoon, Philip Bryan B.
 * 131311399
 * 26 July 2013 */

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit: ");
        float tempFahrenheit = sc.nextFloat();
        
        float fahrenheitToCelsius = (tempFahrenheit-32) * 5 / 9;
        
        System.out.println();
        System.out.println(tempFahrenheit + " Fahrenheit = " +
		  							fahrenheitToCelsius + " Celsius");
    }
}
