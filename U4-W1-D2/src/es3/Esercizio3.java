package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                String parola;

                while (true) {
                    System.out.print("Inserisci una parola, inserisci q per uscire: ");
                    parola = scanner.nextLine();

                    if (parola.equals("q")) {
                        break;
                    }

                    for (int i = 0; i < parola.length(); i++) {
                        System.out.print(parola.charAt(i));
                        if (i < parola.length() - 1) {
                            System.out.print(", ");
                        }
                    }
                    System.out.println();
                }
            }
        }
