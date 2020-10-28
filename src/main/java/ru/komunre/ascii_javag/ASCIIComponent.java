package ru.komunre.ascii_javag;

/**
 * Base of all components. Can build, combine childs and append chids.
 * No draw function
 */
public abstract class ASCIIComponent {
    /**
     * Relative position. Parent is 0, 0
     */
    int x, y;
    protected int width, height;
    protected String result;
    protected ASCIIComponent[] components;

    public ASCIIComponent(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Build result
     */
    public abstract void build();

    public String getResult(){ return result; }

    public void appendChild(ASCIIComponent component){
        if (components == null){
            components = new ASCIIComponent[1];
        }
        else {
            components = Tools.expandArray(components);
        }
        components[components.length - 1] = component;
    }

    /**
     * Combine components and get final component.
     * Call for build all child components.
     * Usual running on AJavagFrame.
     */
    public void combineChildes(){
        build();
        try {
            if (components == null) {
                return;
            }
            for (ASCIIComponent child : components) {
                if (child == null) {
                    continue;
                }
                child.combineChildes();
                String[] lines = result.split("\n");
                String childResult = child.getResult();
                String[] childLines = childResult.split("\n");
                if (childLines.length == 0){
                    childLines = new String[]{childResult.replace("\n", "")};
                }
                String[] resultLines = new String[lines.length + childLines.length];
                System.arraycopy(lines, 0, resultLines, 0, child.y);
                for (int x = child.y; x < childLines.length + child.y; x++) {
                    String[] twoParts = {lines[x].substring(0, child.x), lines[x].substring((child.x) + (child.width))};
                    resultLines[x] = twoParts[0] + childLines[x - child.y] + twoParts[1];
                }
                if (resultLines.length - (lines.length - (child.y + childLines.length)) > 0) {
                    System.arraycopy(lines, child.y + childLines.length, resultLines, child.y + childLines.length, lines.length - (child.y + childLines.length));
                }
                result = "";
                for (String line : resultLines){
                    if (line == null || line.equals("null")){ continue; }
                    result += line + "\n";
                }
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void clear(){
        result = "";
        components = null;
    }
}
