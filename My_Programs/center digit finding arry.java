
// Center Digit value Converting in array:

class array2 {
   public static void main(String args[])
   {
      int n[]=new int[10];
      int arr[] ={103,289,339,490,595,145,289};

      for (int i=0;i<arr.length;i++)
       {
           int a= arr[i];
           int x=a/10;
          // int y=a%10;
           int z=x%10;

           System.out.println(z);
       }
      }
   }
