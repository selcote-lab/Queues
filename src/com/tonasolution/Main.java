package com.tonasolution;

public class Main {

    public static void main(String[] args) {

        Employee ali = new Employee("ali", "ahmed", 1223);
        Employee marie = new Employee("Marie", "Smith", 1293);
        Employee casu = new Employee("casu", "lala", 1273);

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(ali);
        queue.add(marie);
        queue.add(casu);
        queue.print();

        System.out.println("Remove the first element -> ");
        queue.remove();
        queue.print();

        System.out.println("Peek an element -> ");
        System.out.println(queue.peek());
        queue.print();

        System.out.println("remove all elements -> ");
        queue.remove();
        queue.remove();
        queue.print();


    }
}
