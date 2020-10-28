import org.junit.Test;
import ru.komunre.ascii_javag.AjavagFrame;
import ru.komunre.ascii_javag.AjavagLabel;
import ru.komunre.ascii_javag.AjavagMultilineLabel;
import ru.komunre.ascii_javag.AjavagRectangle;

public class Multiline {
    @Test
    public void multilineLabel(){
        AjavagFrame frame = new AjavagFrame(100, 21);
        AjavagRectangle rect = new AjavagRectangle(0, 0, 40, 20);
        AjavagMultilineLabel label = new AjavagMultilineLabel(1, 1, 39, "I think this library is awesome. It multilayer and really-really good. Maybe i'll make it faster. I hope it will be popular.");
        rect.appendChild(label);
        frame.appendChild(rect);
        frame.combineChildes();
        frame.draw();
    }
}
