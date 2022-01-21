package main;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ShapeFactoryTest {
    private  final String COLORS[] = { "Red", "Green", "Blue", "Yellow"};

    @Test
    public void shapeFactoryTest(){

                Rectangle rectangle = (Rectangle)ShapeFactory.getRectangle(COLORS[1]);
                rectangle.setLength(50);
                rectangle.setWidth(100);
                rectangle.createShape();

                assertEquals(rectangle.getLength(), 50);
                assertEquals(rectangle.getWidth(), 100);
                assertEquals(rectangle.getTimeCreated(), LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}
