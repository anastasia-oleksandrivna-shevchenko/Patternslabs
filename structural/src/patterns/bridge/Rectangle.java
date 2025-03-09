package patterns.bridge;

public class Rectangle extends Shape {
    private int width,  height;
    public Rectangle(int width, int height, Renderer renderer) {
        super(renderer);
        this.width = width;
        this.height = height;
    }
    @Override
    public void draw() {
        renderer.renderRectangle(width, height);
    }
}
