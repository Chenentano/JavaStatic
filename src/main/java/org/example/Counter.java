package org.example;

public class Counter {


    static int totalCount = 0;
     int instanceCount = 10;

    public static void incrementTotalCount(){
        totalCount++;
    }

    public void incrementInstanceCount(){
        instanceCount++;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "instanceCount=" + instanceCount +
                "totalCount=" + totalCount +
                '}';
    }
}
