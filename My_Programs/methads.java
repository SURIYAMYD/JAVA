/* 
Math function in Java:
    abs()  -  absolute
    ceil() -  rounds x to the smallest integer not less then x
    floor()-  rounds x to the largest integer
    cos()
    tan()
    sin()
    pow()
    exp()  - exponentioal
    min()
    max()


*/
import java.util.Scanner;
public class methads {
    public  void maximum()
    {
        Scanner n=new Scanner(System.in);
        System.out.println("enter the the Numeric Value: ");
        double num1 = n.nextDouble();
        double num2 = n.nextDouble();
        double num3 = n .nextDouble();

        double result = maximum_double(num1,num2,num3);

         System.out.println("Maximum Value Is :"+result);
        
    }
    public double maximum_double(double x,double y,double z)
    {
        double maximumValue = x;
        if (y > maximumValue)
         maximumValue = y;

        if (z > maximumValue)
         maximumValue = z;

        return maximumValue;


    }

    
}
