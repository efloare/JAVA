
/**
 * Write a description of class LAB12 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LAB12
{
    // instance variables - replace the example below with your own
    private Circle Soare;
    private Triangle Acoperis;
    private Square Casa;
    private Square Fereastra;
    private Square Trunchi;
    private Triangle Coroana;
    /**
     * Constructor for objects of class LAB12
     */
    public LAB12()
    {
        // initialise instance variables
        Soare = new Circle();
        Soare.makeVisible();
        Soare.slowMoveHorizontal(180);
         Soare.slowMoveVertical(-20);
         Soare.changeSize(60);
         Soare.changeColor("yellow");
         Acoperis = new Triangle();
         Acoperis.makeVisible();
         Acoperis.slowMoveHorizontal(60);
         Acoperis.slowMoveVertical(50);
         Acoperis.changeSize(120 , 120);
         Acoperis.changeColor("magenta");
         Casa = new Square();
         Casa.makeVisible();
         Casa.changeSize(100);
         Casa.changeColor("blue");
         Casa.slowMoveVertical(130);
         Fereastra = new Square();
         Fereastra.makeVisible();
         Fereastra.changeSize(20);
         Fereastra.changeColor("black"); 
         Fereastra.slowMoveVertical(140);
         Fereastra.slowMoveHorizontal(20);
         Trunchi = new Square();
         Trunchi.makeVisible();
         Trunchi.changeSize(20);
         Trunchi.changeColor("black"); 
         Trunchi.slowMoveVertical(190);
         Trunchi.slowMoveHorizontal(170);
         Coroana = new Triangle();
         Coroana.makeVisible();
         Coroana.slowMoveHorizontal(190);
         Coroana.slowMoveVertical(130);
         Coroana.changeSize(100 , 40);
         Coroana.changeColor("green");
        
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
 
}
