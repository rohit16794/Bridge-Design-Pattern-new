package shapes;

import render.AbstractRenderImpl;

public class Square extends AbstractShape{
    public Square(AbstractRenderImpl abstractRenderImpl) {
        super(abstractRenderImpl);
    }

    @Override
    public void createShape() {
        System.out.println("Creating a square");
    }

    @Override
    public void renderShape(){
        System.out.println("Rendering a square");
        abstractRenderImpl.render("square");
    }
}
