package de.tinf.io;

import java.io.FileNotFoundException;
import java.io.IOException;

public class FileUtils {

    /**
     * Reads the specified file and returns it as string.
     * @param path The path to the file to be read.
     * @return The contents of the file.
     * @throws FileNotFoundException The file does not exist.
     * @throws IOException Something went wrong during reading.
     */
    public String read(String path) throws FileNotFoundException, IOException {
        return null;
    }

    /**
     * The same as {@link FileUtils#read(String)} but returns null on exceptions.
     * @param path The path to the file to be read.
     * @return The contents of the file.
     */
    public String readExceptionFree(String path) {
        return null;
    }
}
