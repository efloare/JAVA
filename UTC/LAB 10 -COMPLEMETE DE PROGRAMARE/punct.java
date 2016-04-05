
/**
 * Write a description of class punct here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class punct
{
 private int x;
 private int y;
 private boolean vizibil;
 public punct(int xx, int yy, boolean v)
 {
 // initialise instance variables
 x = xx;
 y = yy;
 vizibil = v;
 }
 public void translatez(int dx, int dy)
    {
        x = x + dx; y = y + dy;
    }
    public void mod_x(int xx)
    {
        x = xx;
    }
    public void mod_y(int yy)
    {
        y = yy;
    }
    public int da_x()
    {
        return x;
    }
      public int da_y()
    {
        return y;
    }
    public void afiseaza()
    {
        vizibil = true;
    }
    public void ascunde()
    {
        vizibil = false;
    }

}

