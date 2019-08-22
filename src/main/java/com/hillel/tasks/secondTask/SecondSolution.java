package com.hillel.tasks.secondTask;

import java.util.*;

public class SecondSolution {
    public static void main(String[] args) {
        SimpleObject<Thread> simpleObject = new SimpleObject<Thread>();

        // Correct array
        Thread[] array = new Thread[2];
        array[0] = new Thread();
        array[1] = new Thread();

        // Wrong array
//        Character[] wrongArray = new Character[2];
//        wrongArray[0] = 'e';
//        wrongArray[1] = 'w';

        simpleObject.getCollectionFromArray(array, new LinkedList());
    }

}
