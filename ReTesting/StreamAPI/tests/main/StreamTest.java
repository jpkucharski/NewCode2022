package main;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamTest {

    @Test
    public void passingListToMapMethod_ShouldReturnListWithSquare() {
        StreamsAPI st = new StreamsAPI();
        List<Integer> actual = st.map(Arrays.asList(1, 2, 3));
        List<Integer> expected = Arrays.asList(1, 4, 9);
        assertTrue(actual.equals(expected));

    }

    @Test
    public void passingListOfStringToFlatMapMethod_ShouldReturnString() {
        List<String> stringForFlatMap = Arrays.asList(
                "String for flatMap 1", "String for flatMap 2");
        List<String> expected = Arrays.asList(
                "String", "for", "flatMap", "1", "String", "for", "flatMap", "2");
        StreamsAPI st = new StreamsAPI();
        assertEquals(st.flatMap(stringForFlatMap), expected);
    }



}