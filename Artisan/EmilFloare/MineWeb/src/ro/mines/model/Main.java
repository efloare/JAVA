package ro.mines.model;

public class Main {

    public static void main(String[] args){
        GameOfMineField game = new GameOfMineField();
        Point[] mineLocations = new Point[5];
        mineLocations[0] = new Point(0,2);
        mineLocations[1] = new Point(1,0);
        mineLocations[2] = new Point(2,0);
        mineLocations[3] = new Point(3,0);
        mineLocations[4] = new Point(4,0);
        MineField field = game.getMineField(mineLocations);

        int i = 0;
        int k = 0;
        while (k < 9){
            while(i < 9){
                System.out.print("" + field.cells[k][i].c);
                i++;
            }
            System.out.print("\n");
            i = 0;
            k++;
        }
//        System.out.println("" + game.toString());
    }
}
