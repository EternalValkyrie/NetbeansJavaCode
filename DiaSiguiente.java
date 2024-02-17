/*
 
 */
package javaapplication17;

// @author SHADIA
 
import java.util.Scanner;

public class DiaSiguiente {
    
    // Función para obtener el nombre del día siguiente
    public static String obtenerDiaSiguiente(String dia) {
        return switch (dia.toLowerCase()) {
            case "lunes" -> "Martes";
            case "martes" -> "Miércoles";
            case "miércoles" -> "Jueves";
            case "jueves" -> "Viernes";
            case "viernes" -> "Sábado";
            case "sábado" -> "Domingo";
            case "domingo" -> "Lunes";
            default -> "Día no válido";
        };
    }
    
    public static void main(String[] args) {
        // Leer el nombre del día
        try (Scanner scanner = new Scanner(System.in)) {
            // Leer el nombre del día
            System.out.print("Ingrese el nombre de un día: ");
            String dia = scanner.nextLine();
            
            // Obtener el nombre del día siguiente utilizando la función
            String diaSiguiente = obtenerDiaSiguiente(dia);
            
            // Imprimir el nombre del día siguiente
            System.out.println("El día siguiente a " + dia + " es " + diaSiguiente);
        }
    }
}