package ro.mines.model;

/**
 * Created by Bb on 6/13/2016.
 */
public class MineFieldCell {
    protected Point point;
    protected char c;

    public MineFieldCell(Point p, char c){
        this.point = p;
        this.c = c;
    }

    public Point getPoint() {
        return point;
    }

    public char getC() {
        return c;
    }
}
