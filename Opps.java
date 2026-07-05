// class BankDetails{
//     private String userName;
//     private int accountNo;

//      String getUserName(){
//         return this.userName;
//     }

//     void setUserName(String user){
//         userName = user;
//     }

//     int getAccountNo(){
//         return this.accountNo;
//     }

//     void setAccountNo(int no){
//         accountNo = no;
//     }
// }

// public class Opps {
//     public static void main(String[] args) {

//         BankDetails bank = new BankDetails();
//         bank.setUserName("damini");
//         bank.setAccountNo(233456);
//         System.out.println(bank.getAccountNo());
//         System.out.println(bank.getUserName());
//     }
// }

//---------------------------------------------------------------------------

// Copy Constructor

// class Student {
//     String name;
//     int roll_no;
//     String password;
//     int marks[] = new int[3];

//     Student() {
//         System.out.println("Constructor Called...!");
//     };

// shallow copy constructor

// Student(Student s1){
// name = s1.name;
// roll_no = s1.roll_no;
// marks = s1.marks;
// }

// Deep copy constructor

//     Student(Student s1) {
//         name = s1.name;
//         roll_no = s1.roll_no;
//         for (int i = 0; i < marks.length; i++) {
//             this.marks[i] = s1.marks[i];
//         }
//     }
// }

// public class Opps {

//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.name = "damini";
//         s1.roll_no = 19;
//         s1.password = "123";
//         s1.marks[0] = 100;
//         s1.marks[1] = 90;
//         s1.marks[2] = 80;

//         Student s2 = new Student(s1);
//         s2.password = "abc";
//         s1.marks[2] = 99; // changed because arrays are pass by referance but in deep copy not changed
//         s1.roll_no = 20; // not change because the s1 coped in s2 and then we make changes into s1 not reflect in s2
//         System.out.println(s2.name + " " + s2.roll_no + " " + s2.password);
//         for (int i = 0; i < 3; i++) {
//             System.out.print(s2.marks[i] + " ");
//         }
//     }
// }

//-----------------------------------------------------------------------------------------------

// Abstraction

// abstract class Animal {

//     String color;

//     Animal() {
//         color = "brown";    // this call first when we create object of child call
//     }

//     void eat() {
//         System.out.println("Animals Eats");
//     }

//     abstract void walk(); // it is just giving idea
// }

// class Hourse extends Animal {
//     void changeColor() {
//         color = "Drak Brown"; // not appear because it is after to parent
//     }

//     void walk() {
//         System.out.println("Hourse walk by 4 legs"); // they are implementing according them or need
//     }
// }

// class Cheken extends Animal {

//      void changeColor() {
//         color = "Pink"; 
//     }
//     void walk() {
//         System.out.println("Chiken walk by 2 legs");
//     }
// }

// public class Opps {

//     public static void main(String[] args) {
//         Cheken c = new Cheken();
//         c.eat();
//         c.walk();
//         c.changeColor();              
//         System.out.println(c.color);

//         Hourse h = new Hourse();
//         h.eat();
//         h.walk();
//         System.out.println(h.color);
//     }
// }

// -----------------------------------------------------------------------------------

// Interfaces :- multiple interface

// interface Harbiworse {
//     void eatH();
// }

// interface Carnoworse {
//     void eatC();
// }

// class Bear implements Harbiworse, Carnoworse {
//     public void eatH() {
//         System.out.println("I can it Grass");
//     }

//     public void eatC() {
//       System.out.println("I can eat Animals Too");
//     }
// }

// public class Opps {

//     public static void main(String[] args) {
//         Bear bear = new Bear();
//         bear.eatH();
//         bear.eatC();
//     }
// }

//----------------------------------------------------------------------------------

// Super Keyword

// class Animal {
//     String color;

//     Animal(String color) {
//         this.color = color;
//         System.out.println("Animal Constructor Called..");
//     }
// }

// class Human extends Animal {
//     String name;

//     Human(String color, String name) {
//         super(color);
//         this.name = name;
//         System.out.println("Human Constructor called..");
//     }
// }

// public class Opps {

//     public static void main(String[] args) {

//        Human h = new Human("Pink", "peecock");
//        System.out.println(h.color + " " + h.name);

//     }
// }

//-------------------------------------------------------------------------

// child object parent referance

// class Vehicle {
//     String name = "car";

//     void print() {
//         System.out.println("Print method Parent");
//     }
// }

// class Car extends Vehicle {
//     String name = "audii";

//     void print1() {
//         System.out.println("Print method Child");
//     }
// }

// public class Opps {

//     public static void main(String[] args) {
//         Vehicle v = new Car();
//         System.out.println(v.name);
//         v.print();       // because of ovveriding the child function will work
//     }
// }

//----------------------------------------------------------------------------------

// Excersice

import java.util.*;

class Complex1 {

    void sum(int rn1, int in1, int rn2, int in2) {
        int rs = rn1 + rn2;
        int is = in1 + in2;
        System.out.println("sum of Real part: " + rs + " sum of Imaginary Part: " + is);
    }

    void difference(int rn1, int in1, int rn2, int in2) {
        int rs = rn1 - rn2;
        int is = in1 - in2;
        System.out.println("difference of Real part: " + rs + " difference of Imaginary Part: " + is);
    }

    void product(int rn1, int in1, int rn2, int in2) {
        int rs = rn1 * rn2 - in1 * in2;
        int is = rn1 * in1 + in2 * rn2;
        System.out.println("Product Real part: " + rs + " Product Imaginary Part: " + is);
    }
}

public class Opps {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first complex number and Second: ");
        int rn1 = sc.nextInt();
        int in1 = sc.nextInt();
        int rn2 = sc.nextInt();
        int in2 = sc.nextInt();

        Complex1 c = new Complex1();
        c.sum(rn1, in1, rn2, in2);
        c.difference(rn1, in1, rn2, in2);
        c.product(rn1, in1, rn2, in2);

    }
}