package com.hillel.tasks.firstTask;

import org.omg.CORBA.BAD_CONTEXT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FirstSolution {
    private static final Logger LOGGER = LoggerFactory.getLogger(FirstSolution.class);
    private static final String PATH = "src\\main\\resources\\fileForFirstTask";

    public static void main(String[] args) {
        FirstSolution solution = new FirstSolution();
        String textFromFile = solution.readFromFile(FirstSolution.PATH);
        List<String> list = solution.removeAllPunct(textFromFile);

        if (list != null && !list.isEmpty()) {
            list.forEach(System.out::println);
        }
    }

    private String readFromFile(String path) {
        StringBuilder sb = new StringBuilder();

        try(BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (IOException ex) {
            LOGGER.info(ex.getMessage());
        }
        return sb.toString();
    }

    private List<String> removeAllPunct(String textFromFile) {
        if (!textFromFile.isEmpty()) {
            List<String> list = new ArrayList<>();
            list = Arrays.asList(textFromFile.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+"));
            return list;
        } else {
            LOGGER.info("No text in file");
            throw new BAD_CONTEXT();
        }
    }
}
