package ru.nshi.learn.lecture9;

import org.junit.jupiter.api.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author rassafel
 */
public class WriteFileTest {
    @Test
    void writeTempFile() throws IOException {
        File tempFile = File.createTempFile("java", "test");
        System.out.println(tempFile.toURI());

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {
            writer.write("Data for test");
            writer.newLine();
        }
    }
}
