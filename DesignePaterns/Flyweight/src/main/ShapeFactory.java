package main;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Rectangle> rectangleMap = new HashMap<String, Rectangle>();

    public static Shape getRectangle(String color) {
        Rectangle rectangle = (Rectangle)rectangleMap.get(color);

        if(rectangle == null) {
            rectangle = new Rectangle(color);
            rectangleMap.put(color, rectangle);
        }
        return rectangle;
    }


}
