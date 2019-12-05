package com.tonasolution;

public class Main {

    public static void main(String[] args) {

        Employee ali = new Employee("ali", "ahmed", 1223);
        Employee marie = new Employee("Marie", "Smith", 1293);
        Employee casu = new Employee("casu", "lala", 1273);

        ArrayQueue queue = new ArrayQueue(3);
        queue.add(ali);
        queue.add(marie);
        queue.add(casu);
        queue.print();

        queue.remove();
        queue.print();

        System.out.println("Peek from the queue-> ");
        System.out.println(queue.peek());
        queue.print();


    }
}
