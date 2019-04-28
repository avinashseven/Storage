/**
 * 
 */
/**
 * @author avinash
 *
 */
package Fraction;
public class Fraction
{
	public static void main(String args[])
	{
		Fraction f = new Fraction(5,2);
        f.add(new Fraction(3,1));
        f.subtract(new Fraction(48,12));
        f.divide(new Fraction(96,10));
        f.multiply(new Fraction(88,62));
        
	}
  private int num;  //numerator
  private int den;  //denominator
  public Fraction(int n, int d) // constructor that requires 2 digits of input
  {
    // assign num = n & den = d as long as d!= 0
	  if(d != 0)
{
num = n;
den = d;
   }
	  else
          System.exit(0);        
  }
  public Fraction add(Fraction b)
  {
int num1 = (this.num * b.den) + (b.num * this.den); // cross multiply and add
      int num2 = this.den * b.den; // multiply the denominators to make them equivlent
   return reduce(num1,num2);// calls reduce() method and returns a new Fraction object
 }
  private Fraction reduce(int num1, int num2) {
	// TODO Auto-generated method stub
	return null;
}
public Fraction subtract(Fraction b)
  {
      int num1 = (this.num * b.den) - (b.num * this.den);// cross multiply and subtact
      int num2 = this.den * b.den;
      return reduce(num1,num2);// sends to reduce method
  }
  public Fraction multiply(Fraction b)
{
      int num1 = this.num * b.num; // multiplys straight accross
      int num2 = this.den * b.den;
      return reduce(num1,num2);// sends to reduce method and returns the reduced fraction to the toString() method
}
  public Fraction divide(Fraction b)
  {      
      int num1 = this.num * b.den; //multiplys the inverse of 2nd fraction object to divide
      int num2 = this.den * b.num;
      return reduce(num1, num2);// sends to reduce method
  }
  public String toString()  // *** convert to a mixed fraction for output only
  {     
   if(num > den && den > 1)   //if true will show fraction object and mixed number                               
	   return (num + "/" + den + " or " + (num/den) + " " + (num % den) + "/" + den);     
      else
   return(num + "/" + den); //will not try to convert fraction object to mixed number
  }
}