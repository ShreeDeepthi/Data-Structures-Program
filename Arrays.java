/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] x = new int[5];
        int[] n = new int[5]; 

        n[0] = 0;
        n[1] = 1;
        n[2] = 2;
        n[3] = 3;
        n[4] = 4;

        for (int i = 0; i < 5; i++) {
            System.out.println(n[i]);
        }

        System.out.println("n values are");
        for (int i = 0; i < 5; i++) { 
            System.out.println(n[i]);
        }

        System.out.println("x values are");
        for (int i = 0; i < 5; i++) { // Initialize and print values of x
            x[i] = i * 10; 
            System.out.println(x[i]);
        }
    }
}
