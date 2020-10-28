package ru.komunre.ascii_javag;

public class AjavagLabel extends ASCIIComponent{
    String text;
    public AjavagLabel(int x, int y, String text){
        super(x, y, text.length(), 1);
        this.text = text;

    }
    @Override
    public void build(){
        this.result = text;
    }
}
