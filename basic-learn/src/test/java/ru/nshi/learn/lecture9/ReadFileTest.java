package ru.nshi.learn.lecture9;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author rassafel
 */
public class ReadFileTest {
    String testFile = "/home/rassafel/Nshi/java-learn/basic-learn/src/main/resources/test.txt";

    String propertiesFile = "props/application.properties";

    String expectedFromFile = "Test text contains apples and orange.\n";

    @Test
    void readProperties() throws IOException {
        InputStream inputStream = ReadFileTest.class.getClassLoader().getResourceAsStream(propertiesFile);

        Properties properties = new Properties();
        properties.setProperty("application.port", "8888");
        System.out.println(properties);
        properties.load(inputStream);
        System.out.println(properties);

        Assertions.assertEquals("8080", properties.getProperty("application.port"));

        System.out.println(System.getenv());
        System.out.println(System.getenv("application.server"));
    }

    @Test
    void readFileFromCurrentJar() {
        InputStream inputStream = ReadFileTest.class.getClassLoader()
            .getResourceAsStream("test.txt");

        System.out.println(ReadFileTest.class.getClassLoader().getResource("test.txt"));

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            String actual = "";
            String line;
            while ((line = reader.readLine()) != null) {
                actual += line + "\n";
            }
            System.out.println(actual);
            Assertions.assertEquals(expectedFromFile, actual);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void readBytesFromFile() {
        try (InputStream inputStream = new FileInputStream(testFile)) {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            String actual = new String(bytes, StandardCharsets.UTF_8);
            System.out.println(actual);
            Assertions.assertEquals(expectedFromFile, actual);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    void readWithReaderFromFile() {
        File file = new File(testFile);

        Assertions.assertTrue(file.exists());

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String actual = "";

            while (reader.ready()) {
                actual += reader.readLine() + "\n";
            }
            System.out.println(actual);
            Assertions.assertEquals(expectedFromFile, actual);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
