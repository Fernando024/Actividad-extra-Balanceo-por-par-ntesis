
package com.mycompany.pilasbalanceo;


public class Nodo<T> {
    private T data;
    private Nodo<T> next;

   public int dato;
    public Nodo siguiente=null;
    
    public Nodo(int dato) {
        this.dato = dato;
        
    }
    
    Nodo tope=null;
        
    public Nodo(T valor) {
        this.data = valor;
    }

    public Nodo(T data, Nodo<T> next) {
        this.data = data;
        this.next = next;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getNext() {
        return next;
    }

    public void setNext(Nodo<T> next) {
        this.next = next;
    }

}

