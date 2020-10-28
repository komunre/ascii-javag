package ru.komunre.ascii_javag;

public class AjavagRectangle extends ASCIIComponent {
    public AjavagRectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void build(){
        result = "";
        for (int y = 0; y != height; y++){
            if (y == 0){
                result += "╔";
            }
            else if (y == height - 1){
                result += "╚";
            }
            else{
                result += "║";
            }
            for (int x = 0; x != width; x++){
                if (y == 0 || y == height - 1) {
                    result += "═";
                }
                else{
                    result += " ";
                }
            }
            if (y == 0){
                result += "╗";
            }
            else if (y == height - 1) {
                result += "╝";
            }
            else {
                result += "║";
            }
            result += "\n";
        }
    }
}
