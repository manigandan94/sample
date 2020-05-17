package Sample;

import java.util.Scanner;

interface Overloading{
   public void display();
   public void display(String name, int age);
}
 class MyInterface implements Overloading{
   String name;
   int age;
   public void display() {
      System.out.println("This is the implementation of the display method");
   }
   public void display(String name, int age) {
      System.out.println("Name: "+name);
      System.out.println("Age: "+age);
   }
   public static void main(String args[]) {
      @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      String name = sc.next();
      System.out.println("Enter your age: ");
      int age = sc.nextInt();
      MyInterface obj = new MyInterface();
      obj.display();
      obj.display(name, age);
   }
}