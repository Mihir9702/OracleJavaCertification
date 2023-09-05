package academy.learnprogramming;

class ClassInheritanceAnimal {
  private int age; 
  private String name; // protected means that it can be accessed by subclasses

  public ClassInheritanceAnimal(int age) {
    System.out.println("Animal");
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void print() {
    System.out.println("name= " + name + " age= " + age);
  }
}

class ClassInheritanceDog extends ClassInheritanceAnimal {

  public ClassInheritanceDog(int age) {
    super(age);
    System.out.println("Dog" + " " + age);
  }
}

class ClassInheritanceHusky extends ClassInheritanceDog {

  public ClassInheritanceHusky(int age) {
    super(age);
    System.out.println("Husky");
  }
}

class ClassInheritanceCat extends ClassInheritanceAnimal {

  public ClassInheritanceCat(int age) {
    super(age);
    System.out.println("Cat");
  }
}

public class ClassInheritance {
  
  public static void main(String[] args) {
    new ClassInheritanceHusky(5); // Animal Dog Husky
    new ClassInheritanceCat(6); // Animal Cat

    ClassInheritanceDog dog = new ClassInheritanceDog(3); 

    dog.setName("Rex");
    dog.print();
  }
}
