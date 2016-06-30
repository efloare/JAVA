package main;

import java.util.ArrayList;

/**
 * Created by Bb on 6/13/2016.
 */

class Point{

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
}
class MineField{

    MineFieldCell[][] cells = new MineFieldCell[9][9];

    public MineField() {


        int i = 0;
        int k = 0;
        while (i < 9){
            while(k < 9){
                this.cells[i][k] = new MineFieldCell(new Point(i, k), '0');
                k++;
            }
//            System.out.println("\n=====" + this.cells[i].toString());
            k = 0;
            i++;
        }
    }
}

public class GameOfMineField {
    public MineField getMineField(Point[] mineLocations) {
        int i = 0;

        MineField mainField = new MineField();
        while (i < mineLocations.length) {
            mainField.cells[mineLocations[i].getX()][mineLocations[i].getY()] = new MineFieldCell(mineLocations[i], 'M');
//            System.out.println("" + i + "====i\t");
//            System.out.println("" + mineLocations[i].getX() + "====X\t");
//            System.out.println("" + mineLocations[i].getY()+ "====Y\t");
//            System.out.println("" + mainField.cells[mineLocations[i].getX()][mineLocations[i].getY()].c+ "====M???\t");
              i++;
        }
        int k = 0;
        int d = 0;
        i = 0;
        while(k < 9){
            while(i < 9){
                try {
                    while(mainField.cells[k][i].c == 'M') {
                        i++;
                    }
                    if (mainField.cells[k][i + 1].c == 'M' && i <= 9 && i >= 0) {
                        d++;
                    }
                    if (mainField.cells[k][i - 1].c == 'M' && i <= 9 && i >= 0) {
                        d++;
                    }
                    if (mainField.cells[k - 1][i + 1].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                    if (mainField.cells[k - 1][i].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                    if (mainField.cells[k - 1][i - 1].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                    if (mainField.cells[k + 1][i].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                    if (mainField.cells[k + 1][i + 1].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                    if (mainField.cells[k + 1][i - 1].c == 'M' && i >= 0 && i <= 9) {
                        d++;
                    }
                } catch(Exception e){
//                    System.out.println(e.getMessage());
                }
                mainField.cells[k][i].c = (char) ('0' + d);
                i++;
                d = 0;
            }
            i = 0;
            k++;
        }
        return mainField;
    }
 }



