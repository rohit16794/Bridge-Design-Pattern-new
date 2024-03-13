package render;

public class JavaFXRender extends AbstractRenderImpl{
    @Override
    public void render(String shape) {
        System.out.println("Rendering " + shape + "via JavaFX");
    }
}
