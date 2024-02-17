/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package longitudescalera;

/**
 *
 * @author SHADIA
 */
public class LongitudEscalera {

    public static double calcularLongitudEscalera(double altura, double angulo) {
        // Convertir el angulo de grados a radianes
        double anguloEnRadianes = Math.toRadians(angulo);
        
        // Calcular la longitud de la escalera utilizando la formula de trigonometria
        double longitudEscalera = altura / Math.sin(anguloEnRadianes);
        
        return longitudEscalera;
    }

    public static void main(String[] args) {
        // Ejemplo de uso
        double altura = 5.0; // Altura de la escalera en metros
        double angulo = 30.0; // Angulo de inclinacion en grados
        
        double longitudEscalera = calcularLongitudEscalera(altura, angulo);
        System.out.println("La longitud de la escalera es: " + longitudEscalera + " metros.");
    }
}