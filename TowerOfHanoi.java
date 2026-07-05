import java.util.*;

class Book{
    String title;
    String auther;
    int price;

    Book(String title, int price){
        this.title = title;
        this.price = price;
    }
    
    Book(String title, String auther, int price){
        this.title = title;
        this.auther = auther;
        this.price = price;
    }

    void display(){
        System.out.println(title + " " + auther + " " + price);
    }

}
class Car {

    private String name;
    private int Wheels;

    Car(String name, int Wheels) {
        this.name = name;
        this.Wheels = Wheels;
    }

    void print() {
        System.out.println(name + " " + Wheels);
    }
}

class Student {

    private String name;
    private int rollNo;
    private float marks;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setRoll(int rollNO) {
        this.rollNo = rollNO;
    }

    int getRoll() {
        return rollNo;
    }

    void setMark(float marks) {
        this.marks = marks;
    }

    float getMark() {
        return marks;
    }
}

class Rectangle {

    int length = 4;
    int breadth = 2;

    void area() {
        System.out.println(length * breadth);
    }

    void perimeter() {
        System.out.println(2 * length + 2 * breadth);
    }
}

class BankAccount {
    Scanner sc = new Scanner(System.in);
    int balance = sc.nextInt();

    void deposite(int amount) {
        balance = balance + amount;

    }

    void withDraw(int amount) {
        balance = balance - amount;

    }

    void TotalCash() {
        System.out.println(balance);
    }
}

public class TowerOfHanoi {
    public static int Tower(int n, char source, char destination, char auxilary) {
        if (n == 0) {
            return 0;
        }

        int count = 0;
        count += Tower(n - 1, source, auxilary, destination);
        System.out.println("Moved " + n + " from " + source + " to " + destination);
        count++;

        count += Tower(n - 1, auxilary, destination, source);
        return count;
    }

    public static void move(char s, char d) {
        System.out.println("Moved from " + s + " to " + d);
    }

    public static void Iteration(int n, char s, char d, char a) {

        if (n % 2 == 0) {
            char temp = d;
            d = a;
            a = temp;
        }

        int totalMove = (int) Math.pow(2, n) - 1;

        for (int i = 1; i <= totalMove; i++) {
            if (i % 3 == 1) {
                move(s, d);
            } else if (i % 3 == 2) {
                move(s, a);
            } else {
                move(a, d);
            }
        }
    }

    public static void main(String[] args) {

        // Iteration(3, 'A', 'C', 'B');

        Book b = new Book("Maths", 250);
        b.display();

        // Car c = new Car("Merserdize", 4);
        // c.print();

        // Student s = new Student();
        // s.setName("damini");
        // System.out.println(s.getName());

        // Rectangle r = new Rectangle();
        // r.area();
        // r.perimeter();

        // BankAccount b = new BankAccount();
        // b.TotalCash();
        // b.withDraw(50);
        // b.TotalCash();
        // b.deposite(1000);
        // b.TotalCash();

    }
}