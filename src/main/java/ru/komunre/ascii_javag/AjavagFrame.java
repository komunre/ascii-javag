package ru.komunre.ascii_javag;

public class AjavagFrame extends ASCIIComponent {
    public AjavagFrame(int width, int height){
        super(0, 0, width, height);
    }
    @Override
    public void build(){
        result = "";
        for (int y = 0; y != height; y++) {
            for (int x = 0; x != width; x++) {
                result += " ";
            }
            result += "\n";
        }
    }
    public void sizeCaution(){
        String[] caution = {"Caution! This program running in ASCII mode at size",  "" + width + "x" + height, "Please resize window"};
        APosition start = new APosition(200 / 2 - 2, 100 / 2 - 3);
    }
    public void draw(){
        System.out.print(result);
    }
}
