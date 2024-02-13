/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.mavenproject7;

/**
 *
 * @author ekaterina
 */
public interface List { 
    
    void add(Integer e) throws EmptyElementException;
    
    void delete(int index) throws IndexOutOfBoundException;
    
    Integer pop();
    
    Integer get(int index) throws IndexOutOfBoundException;
    
    int size();
    
    
    
}
