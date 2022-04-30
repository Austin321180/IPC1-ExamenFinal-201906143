package finallab;

import java.util.Scanner;

public class FinalLab {

    public static void main(String[] args) {
        //Menu
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("*********************");
            System.out.println("*1. Ejercicio 1     *");
            System.out.println("*2. Ejercicio 2     *");
            System.out.println("*3. Ejercicio 3     *");
            System.out.println("*4. salir           *");
            System.out.println("*********************");
            System.out.println("Ingrese su opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    ejercicio1();
                    break;
                case 2:
                    ejercicio2();
                    break;
                case 3:
                    ejercicio3();
                    break;
                default:
                    System.out.println("salio del programa");
            }
        } while (op <= 3);

    }

    //ejercicio 1
    public static void ejercicio1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("ingrese el primer valor");
        int num1 = sc.nextInt();
        System.out.println("ingrese el segundo valor");
        int num2 = sc.nextInt();
        System.out.println("---------------------------");
        if (num1 > num2) {
            System.out.println("el numero 1 es mayor: " + num1);
        } else {
            System.out.println("el numero 2 es mayor: " + num2);
        }
    }

    //ejercicio 2
    public static void ejercicio2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.println("ingrese el numero impar");
        char ob = '*';
        int imp = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= Math.ceil((float) imp / 2); i++) {
            for (int j = 1; j <= imp - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i * 2) - 1; k++) {
                System.out.print(ob);
            }
            System.out.println();
        }

    }

    //ejercicio 3
    public static void ejercicio3() {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("---------------------------");
            System.out.println("1. 8 vacas");
            System.out.println("2. 10 vacas");
            System.out.println("3. salir del ejercicio 3");
            System.out.println("---------------------------");
            System.out.println("ingrese su opcion");
            op = sc.nextInt();
            switch (op) {
                case 1:
                    int vacas8[] = {223, 243, 100, 200, 200, 155, 300, 150};
                    int leche8[] = {30, 34, 28, 45, 31, 50, 29, 1};
                    int cont = 0;
                    int cont2 = 0;
                    for (int i = 0; i < vacas8.length; i++) {
                        //System.out.println("peso de las vacas: " + "[" + vacas8[i] + "]");
                        cont += vacas8[i];
                    }
                    System.out.println("Entrada: " + 8);
                    System.out.println("Peso limite: " + 1000);
                    System.out.println("peso vacas: " + cont);
                    for (int i = 0; i < leche8.length; i++) {
                        //System.out.println("peso de las vacas: " + "[" + leche8[i] + "]");
                        cont2 += leche8[i];
                    }
                    System.out.println("la salida litros de leche: " + cont2);
                    break;

                case 2:
                    int vacas10[] = {340, 355, 223, 243, 130, 240, 260, 155, 302, 130};
                    int leche10[] = {45, 50, 34, 39, 29, 40, 30, 52, 31, 1};
                    int cont1 = 0;
                    int cont3 = 0;
                    System.out.println("Entrada: " + 10);
                    System.out.println("Peso limite: " + 2000);
                    for (int i = 0; i < vacas10.length; i++) {
                        //System.out.println("peso de las vacas: " + "[" + vacas10[i] + "]");
                        cont1 += vacas10[i];
                    }
                    System.out.println("peso vacas: " + cont1);
                    for (int i = 0; i < leche10.length; i++) {
                        //System.out.println("peso de las vacas: " + "[" + leche10[i] + "]");
                        cont3 += leche10[i];
                    }
                    System.out.println("la salida litros de leche: " + cont3);
                    break;
            }
        } while (op <= 2);
    }
}
