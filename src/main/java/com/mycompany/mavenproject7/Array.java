/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject7;

/**
 *
 * @author ekaterina
 */
public class Array implements List {
    
    int[] array;
    int size = 0;
    
    public Array(int size) {
        
        array = new int[size];
        
    }
    
    public Array(int[] array){
        
        this.array = array;
    } 
    
    public void add(Integer e) throws EmptyElementException {
        
        array[size] = e;
        size++;
        
        if (size == array.length) {
            int[] array1 = new int[size];
            for (int i = 0; i < size; ++i) {
                array1[i] = array[i];
            }
            array = array1;   
        }
        
    }
    
    public void delete(int index) throws IndexOutOfBoundException {
        
        int[] array1 = new int[array.length - 1];
        for (int i = 0; i < array.length; ++i) {
            if (i > index) {
                array1[i-1] = array[i];
            }
            if (i < index){
                array1[i] = array[i]; 
            }
        }
        array = array1; 
        
    }
    
   public Integer pop() {
       
       int lastElement = array[array.length - 1];
       int[] array1 = new int[array.length - 1];
       for (int i = 0; i < array.length - 1; ++i) {
           array1[i] = array[i];
       }
       array = array1;
       return lastElement;
       
   }
    
    public Integer get(int index) throws IndexOutOfBoundException{
        
       return array[index]; 
       
    }
    
    public int size() {
        
        return array.length;
        
    }
    
    public Integer findFirst(int value) throws EmptyElementException{
        
        int first = -1;
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == value) {
                first = i;
                break;
            }
        }
        return first;
     
    }
    
    public void deleteAll(int value) throws IndexOutOfBoundException {
        
        int delta = 0;
        for (int i = 0; i < array.length + delta; ++i) {
            if (array[i - delta] == value) {
                delete(i - delta);
                delta++;
            }
        }
        
    }
}
