
/**
 * Write a description of class triunghi here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triunghi
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;
    private int l;
    private int h;

    /**
     * Constructor for objects of class triunghi
     */
    public triunghi()
    {
        // initialise instance variables
        x = y = l = h = 0;
    }
    public triunghi(int xx, int yy, int ll , int hh)
    {
        x = xx; y = yy; l = ll; h = hh;
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
        l = (int)(l * factor);
        h = (int)(h * factor);
    }
    public int perimetru()
    {
        int l2 = (int)(Math.sqrt(l * l / 4. + h * h));
        return l + l2 * 2;
    }
    public int arie()
    {
        return (int)(l * h / 2);
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
    public void mod_l(int ll)
    {
        l = ll;
    }
     public void mod_h(int hh)
    {
        h = hh;
    }
    public int da_l()
    {
        return l;
    }
      public int da_h()
    {
        return h;
    }
}
