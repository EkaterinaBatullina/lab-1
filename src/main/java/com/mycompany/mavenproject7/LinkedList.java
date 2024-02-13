/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject7;

/**
 *
 * @author ekaterina
 */
public class LinkedList implements List{
    Node head;
        
    public void add(Integer e) throws EmptyElementException {
        
        if (head == null) {
            head = new Node();
            head.value = e;
        }
        else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node();
            current = current.next;
            current.value = e;
        }
        
    }
    
    public void delete(int index) throws IndexOutOfBoundException {
        
        int currentNumber = 0;
        Node current = head;
        if (index == 0) {
            current = head.next;
            head = current;
        }
        while (current != null) {
            currentNumber++;
            if (currentNumber == index) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
   
    }
    
    public Integer pop() {
        
        int lastValue;
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        lastValue = current.next.value;
        current.next = null;
        return lastValue ;
        
    }
    
    public Integer get(int index) throws IndexOutOfBoundException {
        
        Node current = head;
        for (int i = 0; i < index; ++i) {
            current = current.next;
        }
        return current.value;
        
    }
    
    public int size() {
        
        int size = 0;
        if (head != null) {
            Node current = head;
            size++;
            while (current.next != null) {
                size++;
                current = current.next;
            }
        }
        return size;
        
    }
    
}
