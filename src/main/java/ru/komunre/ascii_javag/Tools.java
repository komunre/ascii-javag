package ru.komunre.ascii_javag;

import java.util.HashMap;

public class Tools {
    public static ASCIIComponent[] expandArray(ASCIIComponent[] array){
        ASCIIComponent[] newArray = new ASCIIComponent[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    /**
     * Create a string full of spaces.
     * @param length Length of a string and also amount of spaces.
     * @return String
     */
    public static String createEmpty(int length){
        StringBuilder builder = new StringBuilder(length);
        for (int x = 0; x != length; x++){
            builder.append(' ');
        }
        return builder.toString();
    }

    public static Compatibility checkCompatibility(int width, int height, int childWidth, int childHeight){
        if (width < childWidth){
            return Compatibility.PARTIAL_COMPATIBLE;
        }
        if (height < childHeight){
            return Compatibility.INCOMPATIBLE;
        }
        return  Compatibility.COMPATIBLE;
    }
}
