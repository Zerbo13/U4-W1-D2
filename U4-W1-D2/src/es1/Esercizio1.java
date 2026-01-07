package es1;

import java.util.Scanner;

public class Esercizio1 {

    //PariDispari
    public static boolean numeroStringa(String s) {
        if (s.length() % 2 == 0) {
            return true;
        } else{
                return false;
        }
    }

    //Anno Bisestile
    public static boolean annoBisestile(int anno) {
        if (anno % 400 == 0) {
            return true;
        } else if (anno % 100 == 0) {
            return false;
        } else if (anno % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci una parola: ");
        String testo = scanner.nextLine();
        System.out.println("La lunghezza è pari? " + numeroStringa(testo));

        System.out.print("Inserisci un anno: ");
        int anno = scanner.nextInt();
        System.out.println("L'anno bisestile? " + annoBisestile(anno));

    }
}
