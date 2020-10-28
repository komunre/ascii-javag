package ru.komunre.ascii_javag;

/**
 * A label that can automatically take all height of parent for text;
 */
public class AjavagMultilineLabel extends ASCIIComponent {
    String text;

    /**
     * Creates multiline label
     * @param x Coordinate x relative to parent
     * @param y Coordinate y relative to parent
     * @param width Width of text. Printing text with this width and translate to other lines.
     * @param text Text of a label
     */
    public AjavagMultilineLabel(int x, int y, int width, String text) {
        super(x, y, width, 0);
        this.text = text;
    }

    @Override
    public void build(){
        result = "";
        String line = "";
        int counter = 0;
        while(line != null){
            if (text.length() - counter <= 0){
                line = null;
            }
            else {
                if (text.length() - (counter + width) <= 0) {
                    line = text.substring(counter);
                    line += Tools.createEmpty(width - line.length()) + "\n";
                } else {
                    line = text.substring(counter, counter + width) + "\n";
                }
                counter += width;
                result += line;
            }
        }
    }
}
