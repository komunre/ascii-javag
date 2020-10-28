package ru.komunre.ascii_javag;

public class AjavagMultilineLabel extends ASCIIComponent {
    String text;
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
