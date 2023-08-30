/*
Method overloading is a Multiple methohds
having a same Name with Different Parameters.
*/


/*

public class Method_overloading{

    static int max(int a ,int b)
    {
        return a>b? a:b;

    }
    static double max(double a ,double b)
    {
        return a>b? a:b;

    }
    static char max(char a ,char b)
    {
        return a>b? a:b;

    }
    public static void main(String args[])
    {
        System.out.println("Maximum value of integer :"+max(10,15));
        System.out.println("Maximum Value of Double :"+max(10.5,20.5));
        System.out.println("Maximum Value of Character :"+max('a','n'));
    }
}

*/

public class Method_overloading{

    static void max()
    {
        System.out.println("Work is software Engineer");

    }
    static void max(int a)
    {
        System.out.println("The preson Age is : "+a);

    }
    static void max(int x ,int b)
    {
        System.out.println("Add the working hours morning and ofternoon : " + (x + b));

    }
    public static void main(String args[])
    {
       max();
       max(18);
       max(8,7);
    }
}