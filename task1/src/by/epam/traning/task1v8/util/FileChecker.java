package by.epam.traning.task1v8.util;

import by.epam.traning.task1v8.entity.Vegetable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileChecker {
    private static final String ABS_PATH = new File("").getAbsolutePath();
    private static final String PATH_TO_FILE = ABS_PATH + "/task1/data/recipiet";
    private File file;
    private Map<Vegetable,Double> vega = new HashMap<>();

    public boolean isReadable() {
        file = new File(PATH_TO_FILE);
        return new File(PATH_TO_FILE).canRead();
    }


    Scanner scanner;

    public void readFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()){
            String lineFromFile = scanner.nextLine();
            String [] strings = lineFromFile.split(" ");



            System.out.println(lineFromFile);
        }


    }

}
