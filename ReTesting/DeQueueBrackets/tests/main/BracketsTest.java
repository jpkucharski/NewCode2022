package main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketsTest {

    public static Brackets brack;


    @BeforeAll
    public static void setUp(){
        brack = new Brackets();
    }

    @Test
    public void sendingOneBracket_ShouldReturnFalse(){
        assertFalse(brack.isClosed("("));
    }

    @Test
    public void sendingTwoClosedBrackets_ShouldReturnTrue(){
        assertTrue(brack.isClosed("()"));
    }

    @Test
    public void sendingNull_ShouldThrowException(){
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class, () ->{
            brack.isClosed(null);
        });
        Assertions.assertEquals("try to put something inside", thrown.getMessage());
    }
    @Test
    public void sendingMultipleClosedBrackets_ShouldReturnTrue(){
        assertTrue(brack.isClosed("(())"));
    }
}