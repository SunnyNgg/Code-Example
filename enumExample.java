package GitHub;

enum Color{
  RED(1, 'R'), YELLOW(2, 'Y'), BLUE(3, 'B'), GREEN(4, 'G'), WHITE(5, 'W'), BLACK(6, 'L');
  // no constructors
  // no attributes

  int code;
  char value;

   Color(int code, char value){
   this.code = code;
   this.value = value;
   }

   public boolean isVipColor(){
    if (this.value == 'B'){
      return true;
    }
     return false;
   }

   public boolean isOlympicColor() {
    if (this.value == 'B' || this.value == 'L'|| this.value == 'Y'|| this.value == 'R'|| this.value == 'G'){
          return true;
        }
          return false;
   }

   public static Color getColor(int code) {
   for(Color c: Color.values()){
    if(c.code == code){
    return c;
     }
    }
    return null;
   }
}

class EnumExample {

  public static void main(String[] args){

    if (Color.BLACK.isVipColor()) {
      System.out.println("Black is a vip color");
    }
    if (Color.RED.isOlympicColor()) {
      System.out.println("Red is a Olympic color");
    }

  }
}