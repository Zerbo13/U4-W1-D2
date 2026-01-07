package es4;

import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci un numero");
        int num = Integer.parseInt(scanner.nextLine());

        System.out.println("Inserisci un numero per iniziare il conto alla rovescia!");
        for(int i = num ; i > 0; i--){
            System.out.println(i);
        }
    }
}
