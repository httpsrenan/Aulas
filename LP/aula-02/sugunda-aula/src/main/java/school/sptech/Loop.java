package school.sptech;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int i = 0;
        do {
            i ++;
            System.out.println(i);
        } while (i <= 10);

        int c = 0;
        while (c < 5) {
            System.out.println("Valor de i: " + c);
            c++;
        }
    }
}
