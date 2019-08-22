package com.hillel.tasks.secondTask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.Collection;

class SimpleObject<T> {
    private static final Logger LOGGER = LoggerFactory.getLogger(SimpleObject.class);
    T t;

    void getCollectionFromArray(T[] array, Collection<T> collection) {
        if (array.length != 0) {
            collection.addAll((Collection<T>) Arrays.asList(array));
            collection.forEach(System.out::println);
        } else {
            LOGGER.info("Array is empty");
        }
    }
}
