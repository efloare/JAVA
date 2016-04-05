
/**
 * Write a description of class Desen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Desen
{
    private Circle PupilaStanga;
    private Circle OchiStang;
    private Circle PupilaDreapta;
    private Circle OchiDrept;
    private Triangle Nas;
    
    public Desen()
    {
    OchiStang = new Circle();
    OchiStang.changeSize(100);
    OchiStang.slowMoveHorizontal(120);
    OchiStang.changeColor("yellow");
    OchiStang. makeVisible();
    
    PupilaStanga =  new Circle();   
    PupilaStanga.changeSize(30);
    PupilaStanga.slowMoveHorizontal(140);
    PupilaStanga.changeColor("blue");
     PupilaStanga.slowMoveVertical(50);
    PupilaStanga. makeVisible();
    
      OchiDrept = new Circle();
     OchiDrept.changeSize(100);
     OchiDrept.changeColor("yellow");
  OchiDrept. makeVisible();
  
    PupilaDreapta =  new Circle();   
    PupilaDreapta.changeSize(30);
  PupilaDreapta.changeColor("blue");
  PupilaDreapta.slowMoveHorizontal(10);
    PupilaDreapta.slowMoveVertical(50);
    PupilaDreapta. makeVisible();
    
    Nas = new Triangle();
    Nas.changeSize(170, 50);
  Nas.changeColor("black");
 Nas.slowMoveHorizontal(80);
 Nas.slowMoveVertical(50);
    Nas. makeVisible();

}
}
