package de.tinf.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
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
     */
    public static String read(String path) {
        try {
            return read(path, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Reads the specified file and returns its contents as a string.
     *
     * @param path                 the path to the file to be read
     * @param propagateExceptions  whether exceptions should be handled or propagated
     * @return the contents of the file as a string, or null in case of an exception
     * @throws IOException if an I/O error occurs reading from the file or a malformed or unmappable byte sequence is read
     */
    public static String read(String path, boolean propagateExceptions) throws IOException {
        try {
            return Files.readString(Path.of(path));
        } catch (IOException e) {
            if (propagateExceptions) {
                throw e;
            } else {
                return null;
            }
        }
    }

    /**
     * Writes the specified contents to the specified file.
     *
     * @param content the content to be written
     * @param path    the path to the file
     * @param append  whether the content should be appended to the file
     * @return true if writing was successful, false otherwise
     */
    public static boolean write(String content, String path, boolean append) {
        try {
            return write(content, path, append, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Writes the specified contents to the specified file.
     *
     * @param content              the content to be written
     * @param path                 the path to the file
     * @param append               whether the content should be appended to the file
     * @param propagateExceptions  whether exceptions should be handled or propagated
     * @return true if writing was successful, false otherwise
     * @throws IOException if an I/O error occurs writing to the file
     */
    public static boolean write(String content, String path, boolean append, boolean propagateExceptions) throws IOException {
        try {
            createFile(path, true);

            if (append) {
                Files.writeString(Path.of(path), content, StandardOpenOption.APPEND);
            } else {
                Files.writeString(Path.of(path), content);

            }

            return true;
        } catch (IOException e) {
            if (propagateExceptions) {
                throw e;
            } else {
                return false;
            }
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
     * Creates a file at the specified path. If the file already exists it gets cleared.
     *
     * @param path the path to the file
     * @return true if the file was created successfully, false otherwise
     */
    public static boolean createFile(String path) {
        try {
            return createFile(path, false);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Creates a file at the specified path. If the file already exists it gets cleared.
     *
     * @param path                 the path to the file
     * @param propagateExceptions  whether exceptions should be handled or propagated
     * @return true if the file was created successfully, false otherwise
     * @throws IOException if an I/O error occurs creating the file
     */
    public static boolean createFile(String path, boolean propagateExceptions) throws IOException {
        try {
            if (exists(path)) {
                write("", path, false, true);
                return true;
            }

            Path file = Path.of(path);
            Files.createDirectories(file.getParent());
            Files.createFile(file);
            return true;
        } catch (IOException e) {
            if (propagateExceptions) {
                throw e;
            } else {
                return false;
            }
        }
    }

    /**
     * Deletes a file or directory at the specified path.
     *
     * @param path the path of the file or directory to be deleted
     * @return true if the file or directory is successfully deleted, false otherwise
     * @throws RuntimeException if an IOException occurs while deleting the file or directory
     */
    public static boolean delete(String path) {
        try {
            return delete(path, false);
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }



    /**
     * Deletes a file or directory at the specified path.
     *
     * @param path the path of the file or directory to be deleted
     * @param propagateExceptions whether exceptions should be propagated or not
     * @return true if the file or directory is successfully deleted, false otherwise
     * @throws IOException if an I/O error occurs while deleting the file or directory
     */
    public static boolean delete(String path, boolean propagateExceptions) throws IOException {
        if (!exists(path)) {
            return true;
        }

        try {
            Path file = Path.of(path);
            if (file.toFile().isDirectory()) {
                for (String subFile : file.toFile().list()) {
                    if (!delete(Path.of(file.toString(), subFile).toString(), true)) {
                        return false;
                    };
                }
            }

            Files.deleteIfExists(file);
            return true;
        } catch(IOException e) {
            if (propagateExceptions) {
                throw e;
            } else {
                return false;
            }
        }
        
    }
}
