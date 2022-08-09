/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Pila {
    String datos[] = new String[1000];
    int tope;
    
    public Pila(){
        tope = 0;
    }
    
    public boolean push(String dato){
        if(isFull())return false;
        datos[tope++] = dato;
        return true;
    }
    
    public boolean pop(String dato){
        if(isEmpty())return false;
        tope--;
        return true;
    }
    
    public boolean isFull(){
        return tope == datos.length - 1;
    }
    
    public boolean isEmpty(){
        return tope == -1;
    }
}
