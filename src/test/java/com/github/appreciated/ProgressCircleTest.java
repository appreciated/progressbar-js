package com.github.appreciated;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProgressCircleTest {

    @Test
    public void testProgressBarConstructor() {
        //VaadinService.setCurrent(new VaadinServletService(null, null));

        ProgressCircle pb1 = new ProgressCircle();
        assertEquals(pb1.getValue(), 0.0, 0.0);
        assertEquals(pb1.getMax(), 1.0, 0.0);
        assertEquals(pb1.getMin(), 0.0, 0.0);


        ProgressCircle pb2 = new ProgressCircle(2.0, 4.0, 3.0);
        assertEquals(pb2.getValue(), 3.0, 0.0);
        assertEquals(pb2.getMax(), 4.0, 0.0);
        assertEquals(pb2.getMin(), 2.0, 0.0);

    }
}