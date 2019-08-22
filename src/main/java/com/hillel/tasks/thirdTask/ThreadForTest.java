package com.hillel.tasks.thirdTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThreadForTest extends Thread {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThreadForTest.class);
    IncrementSynchronize incrementSynchronize;

    public void setIncrementSynchronize(IncrementSynchronize incrementSynchronize) {
        this.incrementSynchronize = incrementSynchronize;
    }

    @Override
    public void run() {
        incrementSynchronize.incrementValue();
        LOGGER.info(this.getName() + " " + incrementSynchronize.getValue());
    }
}
