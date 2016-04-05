
/**
 * Write a description of class cerc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cerc
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int r;
    /**
     * Constructor for objects of class cerc
     */
    public cerc()
    {
        // initialise instance variables
        x = y = r = 0;
    }
    public cerc(int xx, int yy, int rr)
    {
        x = xx; y = yy; r = rr;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void translatez(int dx, int dy)
    {
        x = x + dx; y = y + dy;
    }
    public void scalez(double factor)
    {
        r = (int)(r * factor);
    }
    public int perimetru()
    {
        return (int) (2. * 3.14159 * r);
    }
    public int arie()
    {
        return (int) (3.14159 * r * r);
        
    }
     public void desenez()
    {
    }
     public void mod_x(int xx)
    {
        x = xx;
    }
    public void mod_y(int yy)
    {
        y = yy;
    }
    public void mod_r(int rr)
    {
        r = rr;
    }
    public int da_x()
    {
        return x;
    }
      public int da_y()
    {
        return y;
    }
      public int da_r()
    {
        return r;
    }
}
