import java.util.Scanner;

/*enum RomanNumber{
  I(1),
  V(5),
  X(10),
  L(50),
  C(100),
  D(500),
  M(1000); 


  private final int number;

  private RomanNumber(int number){
    this.number = number;
  }
}/* */
class A {
  public static int romanToInt (String s){
    int answer = 0;
    int number = 0;

    for(int i = s.length()-1; i>=0; i--){
      switch (s.charAt(i)){
        case 'I' : number = 1; break;
        case 'V' : number = 5; break;
        case 'X' : number = 10; break;
        case 'L' : number = 50; break;
        case 'C' : number = 100; break;
        case 'D' : number = 100; break;
        case 'M' : number = 1000; break;
      }
      if(4 * number < answer) answer = answer - number;
      else answer = answer + number;
    }
    return answer;

  }
}


public class RomanToInterger {

  public static void main(String[] args){


    Scanner input = new Scanner(System.in);
    System.out.println("Input Roman numerals");
    System.out.println("The noraml numeral is :" + A.romanToInt(input.next()));

    System.out.println(A.romanToInt("III"));
  }
  
}
