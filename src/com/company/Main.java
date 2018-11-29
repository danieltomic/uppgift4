package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Bankkonto account = new Bankkonto();
        Scanner myScanner = new Scanner(System.in);

        boolean hasQuit = false;

        while(hasQuit == false) {
            System.out.println("Insättning eller uttag (0-insättning, 1-uttag)");

            int myInput = myScanner.nextInt();

            if (myInput == 0){
                System.out.println("Ange belopp:");
                account.credit(myScanner.nextDouble());

            }
            else if (myInput == 1){
                System.out.println("Ange belopp:");
                account.withdraw(myScanner.nextDouble());

            }

            System.out.println("Saldo: " + account.getBalance());
            System.out.println("\nVill du avsluta? J=Ja, N=Nej");

            String quitInput = myScanner.next();

            if (quitInput.equals("J")) {
                System.out.println(account.getBalance());
                hasQuit = true;
            }
        }
    }
}
