package by.epam.traning.task1v8;

import by.epam.traning.task1v8.util.FileChecker;

import java.io.FileNotFoundException;

/**
 */
public final class Runner {
    /**
     */
    private Runner() {
    }

    /**
     * @param args - params.
     */
    public static void main(final String[] args) throws FileNotFoundException {
        //
        FileChecker fileChecker = new FileChecker();
        System.out.println(fileChecker.isReadable());
        fileChecker.readFile();
    }
}
