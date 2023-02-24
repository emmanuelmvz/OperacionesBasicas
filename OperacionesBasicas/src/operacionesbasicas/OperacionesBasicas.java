
package operacionesbasicas;

/**
 *
 * @author maryse
 * 
 * Programa para realizar operaciones básicas :
 * suma, resta, multiplicación y division.
 * 
 */

public class OperacionesBasicas {
    
    //int valor1 = 10, valor2 = 8;
    float suma, resta, multiplicación, division;

    public void suma(int valor1, int valor2){
        
        //Reliza el cálculo de la suma
        suma= valor1 + valor2;
        System.out.println("La suma es: " + suma);
    }
    public void resta (int valor1, int valor2){
        //Reliza el cálculo de la resta
        resta= valor1 - valor2;
        System.out.println("La resta es: " + resta);
    }
    public void multiplicacion (int valor1, int valor2){
        //Reliza el cálculo de la multiplicación
        multiplicación = valor1 * valor2;
        System.out.println("La multiplicación es: " + multiplicación);
    }
    public void division (int valor1, int valor2){
        //Reliza el cálculo de la división
        division = valor1 / valor2;
        System.out.println("La division es: " + division);
    }

    public static void main(String[] args) {        
        OperacionesBasicas operaciones = new OperacionesBasicas();
        operaciones.suma(2, 8);
        operaciones.resta(9, 2);
        operaciones.multiplicacion(7, 5);
        operaciones.division(40, 8);
    }
    
}
