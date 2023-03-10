package com.bridgelabz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class NioFileAPITest {
        private static String HOME = System.getProperty("user.home");
        private static String PLAY_WITH_NIO = "TempPlayGround";

        @Test
        public void givenPathWhenCheckedThenConfirm() throws IOException {
        /** check file exists
        *
        */
        Path homePath = Paths.get(HOME);
        assertTrue(Files.exists(homePath));
        /**
        * Delete file and check file not Exists
        */
        Path playPath = Paths.get(HOME + "/" + PLAY_WITH_NIO);
        if (Files.exists(playPath)) {
        Files.delete(playPath);
        }
        assertTrue(Files.notExists(playPath));
        /**
        *   create directory
        */
        Files.createDirectory(playPath);
        assertTrue(Files.exists(playPath));
        /**
        *create file
        */
        IntStream.range(1, 10).forEach(cntr -> {
        Path tempFile = Paths.get(playPath + "/temp" + cntr);
        assertTrue(Files.notExists(tempFile));
        try {
        Files.createFile(tempFile);
        } catch (IOException e) {
        e.printStackTrace();
        }
        assertTrue(Files.exists(tempFile));
        });
        /**
        * list files,directories as well as files with extension
        * listing files
        */
        Files.list(playPath).filter(Files::isRegularFile).forEach(System.out::println);
        /**
        *listing directories
        */
        Files.newDirectoryStream(playPath).forEach(System.out::println);
        Files.newDirectoryStream(playPath, path -> path.toFile().isFile() && path.toString().startsWith("temp"))
        .forEach(System.out::println);
        }
        }
