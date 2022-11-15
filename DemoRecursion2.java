public class DemoRecursion2 {

  public static String reverseString(String s){
    if( s == null ){
      return null;
    }

    if(s.length() <= 1){
      return  s;
    }

    else{
      return (s.charAt(s.length()-1)) + reverseString(s.substring(0,s.length()-1));



    }


  }

public static void main(String[] args){
  System.out.println(DemoRecursion2.reverseString("123456789"));
}
  
}
