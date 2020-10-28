import org.junit.Test;
import ru.komunre.ascii_javag.AjavagFrame;
import ru.komunre.ascii_javag.AjavagLabel;
import ru.komunre.ascii_javag.AjavagRectangle;

public class Complex {
    @Test
    public void complexTest(){
        AjavagFrame frame = new AjavagFrame(100, 30);
        AjavagRectangle rect = new AjavagRectangle(0, 0, 15, 20);
        AjavagRectangle rect2 = new AjavagRectangle(42, 5, 20, 5);
        rect.appendChild(new AjavagLabel(5, 5, "hello"));
        rect.appendChild(new AjavagLabel(5, 10, "Cool thing"));
        rect2.appendChild(new AjavagLabel(1, 1, "Some info"));
        frame.appendChild(rect);
        frame.appendChild(rect2);
        frame.combineChildes();
        frame.draw();
    }
}
