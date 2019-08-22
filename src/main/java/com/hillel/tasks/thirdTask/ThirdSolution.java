package com.hillel.tasks.thirdTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ThirdSolution {
    private static final Logger LOGGER = LoggerFactory.getLogger(ThirdSolution.class);

    public static void main(String[] args) throws Exception {
        IncrementSynchronize incrementSynchronize = new IncrementSynchronize();
        ThreadForTest threadForTest1 = new ThreadForTest();
        ThreadForTest threadForTest2 = new ThreadForTest();
        ThreadForTest threadForTest3 = new ThreadForTest();
        ThreadForTest threadForTest4 = new ThreadForTest();
        ThreadForTest threadForTest5 = new ThreadForTest();
        ThreadForTest threadForTest6 = new ThreadForTest();
        ThreadForTest threadForTest7 = new ThreadForTest();
        ThreadForTest threadForTest8 = new ThreadForTest();
        threadForTest1.setIncrementSynchronize(incrementSynchronize);
        threadForTest2.setIncrementSynchronize(incrementSynchronize);
        threadForTest3.setIncrementSynchronize(incrementSynchronize);
        threadForTest4.setIncrementSynchronize(incrementSynchronize);
        threadForTest5.setIncrementSynchronize(incrementSynchronize);
        threadForTest6.setIncrementSynchronize(incrementSynchronize);
        threadForTest7.setIncrementSynchronize(incrementSynchronize);
        threadForTest8.setIncrementSynchronize(incrementSynchronize);
        threadForTest1.start();
        threadForTest2.start();
        threadForTest3.start();
        threadForTest4.start();
        threadForTest5.start();
        threadForTest6.start();
        threadForTest7.start();
        threadForTest8.start();
        threadForTest1.join();
        threadForTest2.join();
        threadForTest3.join();
        threadForTest4.join();
        threadForTest5.join();
        threadForTest6.join();
        threadForTest7.join();
        threadForTest8.join();

        LOGGER.info("Final value is : " + incrementSynchronize.getValue());
    }
}
