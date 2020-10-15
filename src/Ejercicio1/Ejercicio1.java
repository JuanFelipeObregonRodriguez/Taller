
package Ejercicio1;

/**
 *
 * @author Juan Obregon
 */
import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> array = new ArrayList<>();
        int pares = 0;
        int impares = 0;
        System.out.println("La lista de numeros es la siguiente:");
        for(int i= 0; i < (int)(Math.random()*30+1) ; i++){
            array.add((int)Math.random()*150+1);
            if(array.get(i)%2 == 0)pares += array.get(i);
            else impares += array.get(i);
            System.out.println(i+1+"° "+array.get(i));
        }
        double promedio = (pares+impares)/array.size();
        System.out.println("El promedio de la lista es: " +promedio);
        System.out.println("El número que supera al promerdio de la lista es:");
        for(int i = 0; i < array.size(); i++){
            if(promedio<array.get(i)){
                System.out.println(i+1+"° "+array.get(i));
            }
        }

        System.out.println("la suma de los numeros pares es de: "+pares);
        System.out.println("Y la suma de los numeros impares es de: "+impares);
    }
}
