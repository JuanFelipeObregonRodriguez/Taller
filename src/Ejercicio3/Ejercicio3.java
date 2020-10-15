
package Ejercicio3;

/**
 *
 * @author Juan Obregon
 */
import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList<Double> listaNumeros = new ArrayList<>();
        double mayor = 0; //Mayor en el arraylist
        int posicion = 0; //Ubicacion del numero dentro del array
        System.out.println("La lista de numeros es la siguiente:");
        for (int i = 0; i < 50; i++) {
            listaNumeros.add((Math.random() * 1000));
            System.out.println(i + 1 + "° " + listaNumeros.get(i));
            if (listaNumeros.get(i) > mayor) {
                mayor = listaNumeros.get(i);
                posicion = i + 1;
            }
        }
        System.out.println("El mayor numero es " + mayor + " y ocupa la posició " + posicion + " en la lista");
    }
}
