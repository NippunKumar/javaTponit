package com.javatpoint.mypkg;


class Employees{
   int id;

   public Employees(int id) {
          this.id = id;
   }
}

public class PassByValueExplain {
   public static void main(String[] args) {
	   Employees x=new Employees(1);
          
          System.out.println("In main(), BEFORE passing a by value i.e. BEFORE calling method m()");
          System.out.println("a.id = "+x.id);
          
          m(x); //Here a is reference to object Emp
                 // a is passed by value (i.e. copy of a is created and passed),
                 //a is not at all passed by reference,
                 //it may look like that a is passed by reference but actually that doesn't happens at all
                 //reference are passed and are passed by value:

          System.out.println("\nIn main(), AFTER passing a by value i.e. AFTER calling method m()");
          System.out.println("a.id = "+x.id);
          
   }

   static void m(Employees y){
          y.id = 2;
          System.out.println("\nIn method m(), after making some changes");
          System.out.println("b.id = " + y.id);
   }
   
   
}