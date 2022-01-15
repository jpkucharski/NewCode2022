package main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class BridgeTest {

    @Test
    public void invoicingSquareWithRedColor_ShouldReturnCorrectMessage(){
        Shape square = new Square(new Red());
        Assertions.assertEquals(square.draw(), "Square draw Color is red");
    }

    @Test
    public void invoicingTriangleWithRedColor_ShouldReturnCorrectMessage(){
        Shape square = new Triangle(new Blue());
        Assertions.assertEquals(square.draw(), "Triangle draw Color is blue");
    }


}
