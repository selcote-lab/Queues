package com.tonasolution;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Employee[] queue;
    private int front;
    private int back;

    public ArrayQueue(int capacity){

        queue = new Employee[capacity];
    }

    public void add(Employee employee) {

        if (back >  queue.length) {

            Employee[] newQueue = new Employee[back * 2];
            System.arraycopy(queue, 0, newQueue, 0, back);
            queue = newQueue;
        }

        queue[back++] = employee;
    }

    public Employee remove(){

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        Employee removedEmployee = queue[front];
        queue[front] = null;
        front++;

        if(size() == 0) {
            front = 0;
            back  = 0;
        }

        return removedEmployee;
    }

    public Employee peek(){

        if (size() == 0) {
            throw new NoSuchElementException();
        }

        return queue[front];
    }

    public void print() {

        for (int i = front; i < back; i++) {
            System.out.println(queue[i]);
        }
    }

    public int size(){
        return back - front;
    }
}
