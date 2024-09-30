package de.tinf.io;

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

        assertThrows(RuntimeException.class, () -> {
            FileUtils.read(path);
        });
    }

    @Test
    void testWriteFile() throws IOException {
        String content = "This is the content to be written.";
        String path = "temp/output.txt";

        assertDoesNotThrow(() -> {
            FileUtils.write(content, path, false);
        });

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

        assertDoesNotThrow(() -> {
            FileUtils.createFile(path);
        });

        assertTrue(FileUtils.exists(path));
        assertTrue(new File(path).isFile());
    }

    @Test
    void testCreateNestedFile() {
        String path = "temp/nested/newFile.txt";

        assertDoesNotThrow(() -> {
            FileUtils.createFile(path);
        });

        assertTrue(FileUtils.exists(path));
        assertTrue(new File(path).isFile());
    }

    @Test
    void testDeleteFile() {
        String path = "temp/file/to/delete/file.txt";

        FileUtils.createFile(path);

        assertDoesNotThrow(() -> {
            FileUtils.delete(path);
        });

        assertFalse(FileUtils.exists(path));
    }

    @Test
    void testDeleteDirectory() {
        String path = "temp/dir/";

        FileUtils.createFile(path + "test.txt");
        FileUtils.createFile(path + "dir2/test.txt");
        FileUtils.createFile(path + "dir3/test.txt");

        assertDoesNotThrow(() -> {
            FileUtils.delete(path);
        });

        assertFalse(FileUtils.exists(path));
    }

    @Test
    void testDeleteNonExistingDirectory() {
        String path = "path/to/nonexistent/directory/";

        assertDoesNotThrow(() -> {
            FileUtils.delete(path);
        });
    }

    @Test
    void testAppendWriteFile() {
        String path = "temp/appendFile.txt";

        FileUtils.write("test", path, false);

        assertDoesNotThrow(() -> {
            FileUtils.write("test", path, true);
        });

        assertEquals("testtest", FileUtils.read(path));
    }
}