package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void when204ManThan119dot6() {
        short manHeight = 204;
        double expected = 119.6;
        double out = Fit.manWeight(manHeight);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when172WomanThan71dot3() {
        short womanHeight = 172;
        double expected = 71.3;
        double out = Fit.womanWeight(womanHeight);
        Assert.assertEquals(expected, out, 0.01);
    }
}