public class DemoRecursion {
  public static int getEvenNumberMultiplier(int x){
    //if x = 10, return 2 * 4 * 6 * 8 * 10
    int v; 
    if (x <= 1){
      return 0;
    }

    if (x % 2 ==0){
      v = x;
    }
    else {
      v = x-1;
    }
    if ( v == 2){
      return 2;
    }

    return v * getEvenNumberMultiplier(v - 2 );
    }
    //System.out.println( x + "x" + (x-2) + " ");


  public static void main(String[] args){

    System.out.println("Answer : " + DemoRecursion.getEvenNumberMultiplier(10));
    System.out.println("Answer : " + DemoRecursion.getEvenNumberMultiplier(4));
  }
}

