package Modelo;

public class Node {
    
    private int valor; 
    private Node siguiente; 

    //Métodos constructores
    public Node (int valor) { 
        this.valor = valor; 
        this.siguiente = null; 
    } 

    public Node (int cargo, Node siguiente) { 
        this.valor = cargo; 
        this.siguiente = siguiente; 
    } 

    //Métodos Set
    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
    
   //Métodos get
    public int getValor() {
        return valor;
    }

    public Node getSiguiente() {
        return siguiente;
    }
    
    //Método toString
    public String toString () { 
        return valor + ""; 
    } 
    
}

