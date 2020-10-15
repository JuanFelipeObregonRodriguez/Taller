package Modelo;
/**
 * author Juan Obregon
 */
import java.util.Collections;
import java.util.Vector;

public class ListaEnlazadas {

    private Node cabeza;

    public ListaEnlazadas() {
        this.cabeza = null;
    }

    public Node getCabeza() {
        return cabeza;
    }

    //Método para agregar un nodo al final.
    public void add(int valor) {

        //Creación del objeto Nodo
        Node nodo = new Node(valor);

        //Si la cabeza está vacia, entonces el nodo ingresado becomes la cabeza.
        if (this.cabeza == null) {
            this.cabeza = nodo;
        } else {
            //El nodo auxiliar inicialmente queda valiendo la cabeza.
            Node auxiliar = this.cabeza;
            //Mientras que el siguiente no sea vácio.
            while (auxiliar.getSiguiente() != null) {
                //El auxiliar pasa a tener el valor del siguiente.
                auxiliar = auxiliar.getSiguiente();
            }
            //Cuando se acaba el ciclo, el siguiente, es decir el último, queda valiendo lo del nodo.
            auxiliar.setSiguiente(nodo);
        }

    }

    //Método toString
    public String toString() {

        String s = "";
        //s=s+"Lista: ";

        Node p = this.cabeza;
        while (p != null) {
            s = s + "[" + p.toString() + "]";
            p = p.getSiguiente();
        }

        return s;
    }

    public Vector<Integer> regresarVector() {

        Vector<Integer> vec = new Vector<Integer>();

        Node p = this.cabeza;
      

        while (p != null) {
            vec.add(p.getValor());
            p = p.getSiguiente();
          
        }

        return vec;

    }

    public void organizar() {

        while(true){
            int band=0;
        Node auxiliar = this.cabeza;
        Node auxiliar2 = this.cabeza.getSiguiente();

        while (auxiliar2.getSiguiente() != null) {

            if (auxiliar.getValor() > auxiliar2.getValor()) {
                int aux = auxiliar.getValor();
                auxiliar.setValor(auxiliar2.getValor());
                auxiliar2.setValor(aux);
                band++;
            }
            auxiliar = auxiliar2;
            auxiliar2 = auxiliar.getSiguiente();

            if (auxiliar2 != null && auxiliar2.getSiguiente() == null) {
                if (auxiliar.getValor() > auxiliar2.getValor()) {
                    int aux = auxiliar.getValor();
                    auxiliar.setValor(auxiliar2.getValor());
                    auxiliar2.setValor(aux);
                    band++;
                }
            }
            
            
        }
        if(band==0){
                break;
            }
        }

    }

    public ListaEnlazadas unir(ListaEnlazadas l1, ListaEnlazadas l2) {

        ListaEnlazadas nueva = new ListaEnlazadas();

        for (Integer i : l1.regresarVector()) {
            nueva.add(i);
        }

        for (Integer i : l2.regresarVector()) {
            nueva.add(i);
        }

        nueva = nueva.ordenar(nueva);

        return nueva;
    }

    public ListaEnlazadas ordenar(ListaEnlazadas l) {

        ListaEnlazadas nueva = new ListaEnlazadas();

        Vector<Integer> vec = l.regresarVector();
        
        Collections.sort(vec);


        for (Integer i : vec) {

            nueva.add(i);
        }

        return nueva;

    }

}