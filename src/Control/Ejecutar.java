
package Control;

import Modelo.ListaEnlazadas;
import Vista.InOut;

/**
 *
 * @author Juan Obregon
 * ejercicio 2
 *
 */
public class Ejecutar {

    public static void main(String[] args) {

        InOut ob = new InOut();
        
        ListaEnlazadas lista1 = new ListaEnlazadas();
        ListaEnlazadas lista2 = new ListaEnlazadas();
        
        ob.mostrarInfo("¡Bienvenidx!\n Este programa unirá dos listas.");
        
        //Llenar primera lista.
        int n = ob.solicitarEntero("Primera lista.\nIngrese un entero: ");
        lista1.add(n);
        
        while(true){
            boolean aux = ob.solicitarBoolean("Primera lista.\n¿Desea ingresar un nuevo dato?");
            if(aux==false){
                break;
            }
            n = ob.solicitarEntero("Primera lista.\nIngrese un entero: ");
            lista1.add(n);
        }
         
        //Llenar segunda lista.
        int m = ob.solicitarEntero("Segunda lista.\nIngrese un entero: ");
        lista2.add(m);
        
        while(true){
            boolean aux = ob.solicitarBoolean("Segunda lista.\n¿Desea ingresar un nuevo dato?");
            if(aux==false){
                break;
            }
            m = ob.solicitarEntero("Segunda lista.\nIngrese un entero: ");
            lista2.add(m);
        }
        
        
        String a = "";
        a=a+"La primera lista es: "+lista1+"\n";
        a=a+"La segunda lista es: "+lista2+"\n";
        a=a+"\nOrganizadas son:\n\n";
        
        //Organiza cada una de las listas.
        lista1.organizar();
        lista2.organizar();
        a=a+"La primera lista es: "+lista1+"\n";
        a=a+"La segunda lista es: "+lista2+"\n";
        
        //Nueva lista compuesta.
        
        ListaEnlazadas listanueva = new ListaEnlazadas();
        
        listanueva = listanueva.unir(lista1, lista2);
        
        a=a+"\n\nSi unimos las dos listas, la nueva lista es:\n\n"+listanueva+"\n";
        
        ob.mostrarInfo(a);
        
        
        
    }

}