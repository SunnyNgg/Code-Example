class Animal{
  void eat(){
    System.out.println("123");
  }
}

class Cow extends Animal{
   void eat(String food){
    System.out.println("234");
  }
}

class AnimalFarm{

  public static void main(String[] args){
    Animal cow = new Cow();
    cow.eat("123");

    Animal cow2 = new Animal();
    cow2.eat("234");
  }
}
