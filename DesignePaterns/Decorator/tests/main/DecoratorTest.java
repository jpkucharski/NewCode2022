package main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorTest {

    @Test
    public void decoratingChristmasTree_shouldDecorateItWithGarland() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals(tree1.decorate(),
                "Decorate christmas tree with Garland");
    }

    @Test
    public void decoratingChristmasTree_shouldDecorateItWithGarlandAndLights() {

        ChristmasTree tree2 = new BubbleLights(
                new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals(tree2.decorate(),
                "Decorate christmas tree with Garland with Garland with Bubble Lights");

    }
}

