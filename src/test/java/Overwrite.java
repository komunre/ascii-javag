import org.junit.Test;
import ru.komunre.ascii_javag.AjavagFrame;
import ru.komunre.ascii_javag.AjavagRectangle;

public class Overwrite {
    @Test
    public void overwrite(){
        AjavagFrame frame = new AjavagFrame(100, 30);
        AjavagRectangle rect = new AjavagRectangle(0, 0, 40, 20);
        AjavagRectangle rect2 = new AjavagRectangle(23, 5, 48, 20);
        frame.appendChild(rect);
        frame.appendChild(rect2);
        frame.combineChildes();
        frame.draw();
    }
}
