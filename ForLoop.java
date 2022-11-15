public class ForLoop {

  public static int factorial(int n){
    int i;
    int fact = 1;

    for (i = 1; i <= n; i++){
      fact = fact * i;
      System.out.println(fact + "x" + i + "=" + fact*i );
    }
    return fact;
  }

 


public static void main (String[] args){

  System.out.println(ForLoop.factorial(5));


}
}