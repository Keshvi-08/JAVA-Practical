// Print the sum, difference and product of two complex numbers by creating a
// class named ‘Complex’ with separate methods for each operation whose real
// and imaginary parts are entered by user

import java.util.Scanner;

public class exp3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int real1, real2;
        int img1, img2;

        System.out.println("Enter real part : ");
        real1 = sc.nextInt();
        System.out.println("Enter imaginary part : ");
        img1 = sc.nextInt();

        System.out.println("Enter real part  of second: ");
        real2 = sc.nextInt();
        System.out.println("Enter imaginary part  of second: ");
        img2 = sc.nextInt();

        complex x1 = new complex(real1, img1);
        complex x2 = new complex(real2, img2);

        complex x4 = new complex();
        x4 = x1.add(x1, x2);
        System.out.println("Addition of two complex :");
        System.out.println(x4.real + "+" + x4.img + "i");

        complex x3 = new complex();
        x3 = x1.sub(x1, x2);
        System.out.println("subtraction of two complex :");
        System.out.println(x3.real + "+" + x3.img + "i");

        complex x5 = new complex();
        x5 = x1.mul(x1, x2);
        System.out.println("Multiplication of two complex :");
        System.out.println(x5.real + "+" + x5.img + "i");
        System.out.println("This practical is made by 23CS095-Keshvi siroya");

    }
}

class complex {
    int real, img;

    complex() {
        real = 0;
        img = 0;
    }

    complex(int tempr, int tempi) {
        real = tempr;
        img = tempi;
    }

    complex add(complex c1, complex c2) {
        complex temp = new complex(real, img);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    complex sub(complex c1, complex c2) {
        complex temp = new complex(real, img);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        return temp;
    }

    complex mul(complex c1, complex c2) {
        complex temp = new complex(real, img);
        temp.real = c1.real * c2.real;
        temp.img = c1.img * c2.img;
        return temp;
    }
}
