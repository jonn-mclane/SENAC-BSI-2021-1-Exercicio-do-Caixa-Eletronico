package Exercicios;

import java.util.Scanner;

public class caixa {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;

        System.out.println("Quanto dinheiro gostaria de gastar?");
        int din = teclado.nextInt();

        while (din != 0) {
            if (din >= 100) {
                n100 = din / 100;
                din = din % 100;
            } else if (din >= 50) {
                n50 = din / 50;
                din = din % 50;
            } else if (din >= 20) {
                n20 = din / 20;
                din = din % 20;
            } else if (din >= 10) {
                n10 = din / 10;
                din = din % 10;
            } else if (din >= 5) {
                n5 = din / 5;
                din = din % 5;
            } else if (din >= 2) {
                n2 = din / 2;
                din = din % 2;
            } else if (din >= 1) {
                n1 = din / 1;
                din = din % 1;
            }
        }
        System.out.println(n100 + " notas de R$100.");
        System.out.println(n50 + " notas de R$50.");
        System.out.println(n20 + " notas de R$20.");
        System.out.println(n10 + " notas de R$10.");
        System.out.println(n5 + " notas de R$5.");
        System.out.println(n2 + " notas de R$2.");
        System.out.println(n1 + " notas de R$1.");
    }
}
