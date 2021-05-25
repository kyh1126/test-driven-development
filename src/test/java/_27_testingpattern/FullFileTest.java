package _27_testingpattern;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.fail;

class FullFileTest {
    @Test
    void testFileSystemError() {
        File f1 = new FullFile("foo");

        // anonymous inner class version
        File f2 = new File("foo") {
            @Override
            public boolean createNewFile() throws IOException {
                throw new IOException();
            }
        };

        try {
            saveAs(f2);
            fail();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private File saveAs(File f) throws IOException {
        boolean chk = f.createNewFile();
        System.out.println("file created: " + chk);
        return f;
    }

    // Crash Test Dummy
    private class FullFile extends File {
        public FullFile(String path) {
            super(path);
        }

        public boolean createNewFile() throws IOException {
            throw new IOException();
        }
    }
}
