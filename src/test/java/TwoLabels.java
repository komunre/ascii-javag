import org.junit.Test;
import ru.komunre.ascii_javag.AjavagFrame;
import ru.komunre.ascii_javag.AjavagLabel;
import ru.komunre.ascii_javag.AjavagRectangle;

public class TwoLabels {
    @Test
    public void twoLabels(){
        AjavagFrame frame = new AjavagFrame(100, 30);
        AjavagRectangle rect = new AjavagRectangle(0, 0, 40, 20);
        AjavagLabel label = new AjavagLabel(1, 5, "Label number one");
        AjavagLabel label2 = new AjavagLabel(1, 10, "Label number two");
        rect.appendChild(label);
        rect.appendChild(label2);
        frame.appendChild(rect);
        frame.combineChildes();
        frame.draw();
    }
}
