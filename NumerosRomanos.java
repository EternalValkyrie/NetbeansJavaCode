/*
 
 */
package javaapplication16;

// @author SHADIA
 
import java.util.Scanner;

public class NumerosRomanos {
    
    // Función para obtener la cifra de las decenas de un número de dos dígitos
    public static int obtenerDecenas(int numero) {
        return numero / 10;
    }
    
    // Función para obtener la cifra de las unidades de un número de dos dígitos
    public static int obtenerUnidades(int numero) {
        return numero % 10;
    }
    
    // Función para obtener el equivalente romano de un dígito (0-9)
    public static String convertirUnidadARomano(int unidad) {
        return switch (unidad) {
            case 0 -> "";
            case 1 -> "I";
            case 2 -> "II";
            case 3 -> "III";
            case 4 -> "IV";
            case 5 -> "V";
            case 6 -> "VI";
            case 7 -> "VII";
            case 8 -> "VIII";
            case 9 -> "IX";
            default -> "";
        };
    }
    
    // Función para obtener el equivalente romano en decenas de un dígito (0-9)
    public static String convertirDecenasARomano(int decena) {
        return switch (decena) {
            case 1 -> "X";
            case 2 -> "XX";
            case 3 -> "XXX";
            case 4 -> "XL";
            case 5 -> "L";
            case 6 -> "LX";
            case 7 -> "LXX";
            case 8 -> "LXXX";
            case 9 -> "XC";
            default -> "";
        };
    }
    
    public static void main(String[] args) {
        // Leer el número entero
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el número entero
            System.out.print("Ingrese un número entero entre 1 y 99: ");
            int numero = scanner.nextInt();
            
            // Verificar si el número tiene menos de 3 cifras y no es negativo
            if (numero < 1 || numero > 99) {
                System.out.println("El número debe estar entre 1 y 99.");
            } else {
                // Obtener las decenas y unidades del número
                int decenas = obtenerDecenas(numero);
                int unidades = obtenerUnidades(numero);
                
                // Convertir las unidades a romano
                String romanoUnidades = convertirUnidadARomano(unidades);
                
                // Convertir las decenas a romano
                String romanoDecenas = convertirDecenasARomano(decenas);
                
                // Imprimir el número en romano
                System.out.println("El número en romano es: " + romanoDecenas + romanoUnidades);
            }
        }
    }
}
    

