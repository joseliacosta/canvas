package domain;

import java.util.List;

public class Canvas {
    private int width;
    private int height;
    private Pixel[][] pixels;
    private Color defaultColor;

    public Canvas(int width, int height, Color color) {
        this.width = width;
        this.height = height;
        this.defaultColor = color;

        this.pixels = new Pixel[width][height];
        createPixels();
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Pixel getPixel(int coordX, int coordY) {
        return pixels[coordX][coordY];
    }

    private void createPixels() {
        for (int column = 0; column < width; column++ ) {
            for(int row = 0; row < height; row++) {
                pixels[column][row] = new Pixel(defaultColor);
            }
        }
    }
}
