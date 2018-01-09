package domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class CanvasTest {

    @Test
    public void getWidth() {
        Canvas canvas = new Canvas(8,10, new Color());
        assertEquals(canvas.getWidth(),8);
    }

    @Test
    public void getHeight() {
        Canvas canvas = new Canvas(8,10, new Color());
        assertEquals(canvas.getHeight(),10);

    }
    @Test

    public void getPixel() {
        Color defaultColor = new Color();
        Canvas canvas = new Canvas(2,2, defaultColor);
        assertEquals(canvas.getPixel(0,0).getColor(), defaultColor);
        assertEquals(canvas.getPixel(0,1).getColor(), defaultColor);
        assertEquals(canvas.getPixel(1,0).getColor(), defaultColor);
        assertEquals(canvas.getPixel(1,1).getColor(), defaultColor);

    }
}
