package render;

public class OpenGLRender extends AbstractRenderImpl{
    @Override
    public void render(String shape) {
        System.out.println("Rendering" + shape + "via OpenGL");
    }
}
