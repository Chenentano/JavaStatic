package org.example;

public class Main {
    public static void main(String[] args) {


        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.incrementInstanceCount();
        Counter.incrementTotalCount();

        System.out.println(counter1.toString());
        System.out.println(counter2.toString());

        System.out.println(Counter.totalCount);
        System.out.println(counter1.totalCount);

        System.out.println(counter1.instanceCount);
        System.out.println(counter2.instanceCount);

        System.out.println("__________");
        System.out.println(Calculator.add(2,4));


    }
}