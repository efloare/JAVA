package ro.mines.model;

public class MineField{

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

    public MineFieldCell[][] getCells() {
        return cells;
    }

    public void setCells(MineFieldCell[][] cells) {
        this.cells = cells;
    }
}
