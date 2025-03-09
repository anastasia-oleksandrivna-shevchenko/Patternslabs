package patterns.bridge;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(int radius) {
        System.out.println("Rendering circle in 3D with radius " + radius);
    }
    @Override
    public void renderRectangle(int width, int height) {
        System.out.println("Rendering rectangle in 3D with height " + height + " and width " + width);
    }
}
