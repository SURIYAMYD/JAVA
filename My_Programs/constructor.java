class employee{
    String  name;
    double  salary;
    employee(String n,double s){
        name = n;
        salary = s;
    }
     String getName() {
        return name;

     }      
     void setName(String n) {

        name = n;
     }
     double getSalary() {
         return salary;
     }
     void setSalary(double s) {
        salary = s;
     }

      void desalary(double p){

        salary += salary*p/100;

     }

}




public class constructor {
    public static void main(String args[])
    {
        employee n = new employee("surya",35000);
        n.desalary(10);
        System.out.println(n.getSalary());
    }
    
}
