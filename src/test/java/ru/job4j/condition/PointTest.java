package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when15to40then5dot8309() {
        int x1 = 1;
        int y1 = 5;
        int x2 = 4;
        int y2 = 0;
        double expected = 5.83;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when67to53then4dot1231() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 5;
        int y2 = 3;
        double expected = 4.12;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when40to20then2() {
        int x1 = 4;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
