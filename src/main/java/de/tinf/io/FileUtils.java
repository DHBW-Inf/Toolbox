package de.tinf.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

/**
 * The FileUtils class provides utility methods for file operations.
 */
public class FileUtils {
    /**
     * Reads the specified file and returns its contents as a string.
     *
     * @param path the path to the file to be read
     * @return the contents of the file as a string, or null in case of an exception
     * @throws RuntimeException if an I/O error occurs reading from the file or a
     *                          malformed or unmappable byte sequence is read
     */
    public static String read(String path) {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Writes the specified contents to the specified file.
     *
     * @param content the content to be written
     * @param path    the path to the file
     * @param append  whether the content should be appended to the file
     * @throws RuntimeException if an I/O error occurs writing to the file
     */
    public static void write(String content, String path, boolean append) {
        try {
            if (!exists(path)) {
                createFile(path);
            }

            if (append) {
                Files.writeString(Path.of(path), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of(path), content);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Checks if a file exists at the specified path.
     *
     * @param path the path to the file
     * @return true if the file exists, false otherwise
     */
    public static boolean exists(String path) {
        return Files.exists(Path.of(path));
    }

    /**
     * Creates a file at the specified path. If the file already exists it gets
     * cleared.
     *
     * @param path the path to the file
     * @throws RuntimeException if an I/O error occurs creating the file
     */
    public static void createFile(String path) {
        try {
            if (exists(path)) {
                write("", path, false);
                return;
            }

            Path file = Path.of(path);
            Files.createDirectories(file.getParent());
            Files.createFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Deletes a file or directory at the specified path.
     *
     * @param path the path of the file or directory to be deleted
     * @throws RuntimeException if an I/O error occurs while deleting the file or
     *                          directory
     */
    public static void delete(String path) {
        if (!exists(path)) {
            return;
        }

        try {
            Path file = Path.of(path);
            if (file.toFile().isDirectory()) {
                for (String subFile : file.toFile().list()) {
                    delete(Path.of(file.toString(), subFile).toString());
                }
            }

            Files.deleteIfExists(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
