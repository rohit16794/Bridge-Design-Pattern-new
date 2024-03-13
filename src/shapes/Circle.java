package shapes;

import render.AbstractRenderImpl;

public class Circle extends AbstractShape{

    public Circle(AbstractRenderImpl abstractRender) {
        super(abstractRender);
    }
    @Override
    public void createShape() {
        System.out.println("Creating circle");
    }

    @Override
    public void renderShape() {
        abstractRenderImpl.render("Circle");
    }
}
