package main;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CommandChainTest {

    public TextFileOperationExecutor textFileOperationExecutor;

    @BeforeEach
    public void setUp() {
        textFileOperationExecutor
                = new TextFileOperationExecutor();
    }

    @Test
    public void openingFile_ShouldReturn_CorrectString() {
        String actual = textFileOperationExecutor.executeOperation(
                new OpenTextFileOperation(new TextFile("file1.txt")));
        String expected = "Opening file file1.txt";
        assertEquals(expected, actual);
    }

    @Test
    public void savingFile_ShouldReturn_CorrectString() {
        String actual = textFileOperationExecutor.executeOperation(
                new SaveTextFileOperation(new TextFile("file1.txt")));
        String expected = "Saving file file1.txt";
        assertEquals(expected, actual);
    }

}
