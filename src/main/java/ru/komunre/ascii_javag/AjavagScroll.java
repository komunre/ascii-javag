package ru.komunre.ascii_javag;

public class AjavagScroll extends ASCIIComponent{
    public AjavagScroll(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void build(){
        for (ASCIIComponent child : components){
            child.width -= 1;
        }
        
    }
}
