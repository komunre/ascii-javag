
import org.junit.Test;
import ru.komunre.ascii_javag.AjavagFrame;
import ru.komunre.ascii_javag.AjavagLabel;
import ru.komunre.ascii_javag.AjavagRectangle;

public class RectangleTest {
    @Test
    public void rectangle(){
        AjavagFrame frame = new AjavagFrame(100, 21);
        AjavagRectangle rect = new AjavagRectangle(0, 0, 40, 20);
        AjavagLabel label = new AjavagLabel(2, 10, "hello world");
        rect.appendChild(label);
        frame.appendChild(rect);
        frame.combineChildes();
        frame.draw();
    }
}
