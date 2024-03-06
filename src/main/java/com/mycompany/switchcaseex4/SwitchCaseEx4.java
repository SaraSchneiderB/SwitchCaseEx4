
package com.mycompany.switchcaseex4;

import java.util.Scanner;

public class SwitchCaseEx4 {

    public static void main(String[] args) {

        System.out.println("Digite um número: ");
        Scanner teclado = new Scanner(System.in);

        int numero;
        numero = teclado.nextInt();

        switch (numero) {
            case 1 ->
                System.out.println("O número é 1\nO número é menor que 2");
            case 2 ->
                System.out.println("O número é 2");
            case 3 ->
                System.out.println("O número é 3\nO número é maior que 2");
            default ->
                System.out.println("O número não é 1, 2 ou 3");

        }
    }
}
