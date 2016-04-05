public class cerc extends punct
{
 private int r;
 public cerc(int rr, int xx, int yy)
 {
 // initialise instance variables
 super(xx, yy);
 r = rr;
 }
 public double arie()
 {
 return Math.PI * r * r;
 }

 public double perim()
 {
 return 2 * Math.PI * r;
 }

 public void desenez()
 {
 // Se deseneaza cercul
 }
} 
