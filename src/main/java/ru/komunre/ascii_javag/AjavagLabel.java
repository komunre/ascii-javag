package ru.komunre.ascii_javag;

/**
 * A label that take full width of a text.
 */
public class AjavagLabel extends ASCIIComponent{
    String text;
    /**
     * Creates label.
     * @param x Coordinate x relative to parent
     * @param y Coordinate y relative to parent
     * @param text Text of a label
     */
    public AjavagLabel(int x, int y, String text){
        super(x, y, text.length(), 1);
        this.text = text;

    }
    @Override
    public void build(){
        this.result = text;
    }
}
