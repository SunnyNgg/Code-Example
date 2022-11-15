abstract class Shape{ //abstract class 

  String color;

  abstract double area();

}

class Circle extends Shape {

  int r; 

  public double area(){
    return this.r * this.r * 3.14;
  }
}

abstract class Phone{

  abstract String call();

}
class SmartPhone extends Phone{

  String call(){
  return "12345";
 }

} 


