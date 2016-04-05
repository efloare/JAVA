public class dreptunghi extends punct
{
 private int a;
 private int b;
 /**
 * Constructor for objects of class dreptunghi
 */
 public dreptunghi(int aa, int bb, int xx, int yy)
 {
 // initialise instance variables
 super(xx, yy);
 a = aa;
 b = bb;
 }
 public int arie()
 {
 return a * b;
 }

 public int perim()
 {
 return 2*a + 2*b;
 }

 public void desenez() 
 {
 // Se deseneaza dreptunghiul
 }
} 
