package main;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Rectangle implements Shape {
    private String color;
    private int length;
    private int width;
    private String timeCreated;

    public Rectangle(String color){
        this.color = color;
    }

    @Override
    public void createShape() {
        timeCreated = LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(String timeCreated) {
        this.timeCreated = timeCreated;
    }
}
