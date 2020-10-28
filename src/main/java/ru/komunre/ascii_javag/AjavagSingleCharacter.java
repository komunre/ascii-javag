package ru.komunre.ascii_javag;

/**
 * Class like AjavagLabel but with char type in constructor and automatic size.
 */
public class AjavagSingleCharacter extends ASCIIComponent{
    String text = "";
    public AjavagSingleCharacter(int x, int y, char character) {
        super(x, y, 1, 1);
        text = "" + character;
    }

    @Override
    public void build(){
        result = text;
    }
}
