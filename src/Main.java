import render.JavaFXRender;
import render.OpenGLRender;
import shapes.AbstractShape;
import shapes.Circle;
import shapes.Square;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        AbstractShape square = new Square(new JavaFXRender());
        square.createShape();
        square.renderShape();

        AbstractShape circle = new Circle(new OpenGLRender());
        circle.createShape();
        circle.renderShape();
    }
}