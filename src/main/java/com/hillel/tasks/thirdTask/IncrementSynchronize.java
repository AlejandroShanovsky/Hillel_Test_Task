package com.hillel.tasks.thirdTask;

import lombok.Data;

@Data
public class IncrementSynchronize {
    private int value = 0;

    //First solution with synchronized method
    public synchronized void incrementValue() {
        int nextValue = this.value;
        ++nextValue;
        this.value = nextValue;
    }

    //Second solution with using synchnonized block
//    public void incrementValue() {
//        synchronized (this) {
//             this.value++;
//        }
//    }

    //Third solution: using with lock object
//    private final Object lock = new Object();
//    public void incrementValue() {
//        synchronized (lock) {
//            this.value += 1;
//        }
//    }


}
