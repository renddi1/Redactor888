public class Task1 {
    public void maxMin(double a, double b){
       double min = a;
       double max = a;
       if ( b < min){
        min = b;
       }

       if ( b > max) {
           max = b;
       }

           System.out.println("min = " + min );
           System.out.println("max = " + max);
    }
}
