package shapes;

import render.AbstractRenderImpl;

public abstract class AbstractShape {
    protected final AbstractRenderImpl abstractRenderImpl;

    public AbstractShape(AbstractRenderImpl abstractRenderImpl) {
        this.abstractRenderImpl = abstractRenderImpl;
    }

    public abstract void createShape();
    public abstract void renderShape();
}
