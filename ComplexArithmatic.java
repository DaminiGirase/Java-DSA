import java.util.Scanner;

class Complex {
    int real, imag;

    Complex(int r, int i) {
        real = r;
        imag = i;
    }

    Complex addition(Complex c){
         return new Complex(this.real + c.real, this.imag + c.imag);
    }

    Complex substraction(Complex c){
        return new Complex(this.real - c.real, this.imag - c.imag);
    }
    
    Complex multiply(Complex c){
        int i = this.real * c.real - this.imag * c.imag;
        int j = this.real * c.imag + this.imag * c.real;
        return new Complex(i, j);
    }

    void print(){
        if(imag >= 0){
            System.out.println(real + " + " + imag + "i");
        }else{
            System.out.println(real + " - " + imag + "i");
        }
    }
}

public class ComplexArithmatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Complex Number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);

         System.out.print("Enter Second Complex Number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);

        Complex sum = c1.addition(c2);
        Complex sub = c1.substraction(c2);
        Complex mul = c1.multiply(c2);

        System.out.print("Sum: ");
        sum.print();
        System.out.print("Sub: ");
        sub.print();
        System.out.print("Multiply: ");
        mul.print();

        

    }
}
