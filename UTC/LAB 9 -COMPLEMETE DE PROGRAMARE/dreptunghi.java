
/**
 * Write a description of class dreptunghi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dreptunghi
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int a;
    private int b;

    /**
     * Constructor for objects of class dreptunghi
     */
    public dreptunghi()
    {
        // initialise instance variables
        x = y = a = b = 0;
    }
    public dreptunghi(int xx, int yy, int aa, int bb)
    {
        x = xx; y = yy; a = aa; b = bb;
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
        a = (int)(a * factor);
        b = (int)(b * factor);
    }
    public int perimetru()
    {
        return 2*a + 2 * b;
    }
    public int arie()
    {
        return a * b;
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
    public void mod_a(int aa)
    {
        a = aa;
    }
    public void mod_b(int bb)
    {
        b = bb;
    }
    public int da_x()
    {
        return x;
    }
      public int da_y()
    {
        return y;
    }
      public int da_a()
    {
        return b;
    }
      public int da_b()
    {
        return b;
    }
}

    
    
