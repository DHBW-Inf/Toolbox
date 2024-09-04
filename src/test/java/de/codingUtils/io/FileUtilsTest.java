package de.codingUtils.io;

import org.junit.jupiter.api.*;

import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class FileUtilsTest {
    @BeforeAll
    static void setUp() {
    }

    @AfterAll
    static void tearDown() {
        FileUtils.delete("temp/");
    }

    @Test
    void testReadFile() {
        String path = "target/test-classes/file.txt";
        String expectedContent = "This is the content of the file.";

        String actualContent = FileUtils.read(path);

        assertEquals(expectedContent, actualContent);
    }

    @Test
    void testReadFileWithException() {
        String path = "path/to/nonexistent/file.txt";

        assertThrows(IOException.class, () -> {
            FileUtils.read(path, true);
        });
    }

    @Test
    void testReadFileWithoutExceptionWhenNotPropagating() throws IOException {
        String path = "path/to/nonexistent/file.txt";

        assertFalse(FileUtils.exists(path));
        assertNull(FileUtils.read(path, false));
    }

    @Test
    void testWriteFile() throws IOException {
        String content = "This is the content to be written.";
        String path = "temp/output.txt";

        boolean success = FileUtils.write(content, path, false, true);

        assertTrue(success);

        String actualContent = FileUtils.read(path);
        assertEquals(content, actualContent);
    }

    @Test
    void testFileExists() {
        String path = "target/test-classes/file.txt";

        boolean exists = FileUtils.exists(path);

        assertTrue(exists);
    }

    @Test
    void testFileDoesNotExist() {
        String path = "path/to/nonexistent/file.txt";

        boolean exists = FileUtils.exists(path);

        assertFalse(exists);
    }

    @Test
    void testCreateFile() throws IOException {
        String path = "temp/newFile.txt";

        boolean created = FileUtils.createFile(path, true);

        assertTrue(created);
        assertTrue(FileUtils.exists(path));
        assertTrue(new File(path).isFile());
    }

    @Test
    void testCreateNestedFile() {
        String path = "temp/nested/newFile.txt";

        boolean created = FileUtils.createFile(path);

        assertTrue(created);
        assertTrue(FileUtils.exists(path));
        assertTrue(new File(path).isFile());
    }

    @Test
    void testDeleteFile() {
        String path = "temp/file/to/delete/file.txt";

        FileUtils.createFile(path);

        boolean deleted = FileUtils.delete(path);

        assertTrue(deleted);
        assertFalse(FileUtils.exists(path));
    }

    @Test
    void testDeleteDirectory() {
        String path = "temp/dir/";

        FileUtils.createFile(path + "test.txt");
        FileUtils.createFile(path + "dir2/test.txt");
        FileUtils.createFile(path + "dir3/test.txt");

        boolean deleted = FileUtils.delete(path);

        assertTrue(deleted);
        assertFalse(FileUtils.exists(path));
    }

    @Test
    void testDeleteNonExistingDirectory() {
        String path = "path/to/nonexistent/directory/";

        assertTrue(FileUtils.delete(path));
    }
}