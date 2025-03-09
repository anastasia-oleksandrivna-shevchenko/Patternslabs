package patterns.bridge;

public class RasterRenderer implements Renderer {
    @Override
    public void renderCircle(int radius) {
        System.out.println("Rendering circle in 2D with radius " + radius);
    }
    @Override
    public void renderRectangle(int width, int height) {
        System.out.println("Rendering rectangle in 2D with height " + height + " and width " + width);
    }
}
