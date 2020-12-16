package nl.novi.TripleDigits;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Stap 2 Variabele toevoegen
        int firstDigit;
        int secondDigit;
        int thirdDigit;

        int maximum = 9;

        Random randomizer = new Random();

        firstDigit = randomizer.nextInt(maximum) + 1;
        secondDigit = randomizer.nextInt(maximum) + 1;
        thirdDigit = randomizer.nextInt(maximum) + 1;

        int sumOfDigits = firstDigit + secondDigit + thirdDigit;
        int productOfDigits = firstDigit * secondDigit * thirdDigit;

        System.out.println("Som: " + sumOfDigits);
        System.out.println("Product: " + productOfDigits);

        // Stap 5 Meerdere rondes spelen
        int maxTimesToPlay = 3;
        Scanner userInput = new Scanner(System.in);

        while (true) {

            boolean hasPlayerWon = false;
            while (hasPlayerWon == false) {
                // Stap 3 Lees de input van de gebruiker
                System.out.println("Voer achter elkaar drie getallen in");

                int userChoise1 = userInput.nextInt();
                int userChoise2 = userInput.nextInt();
                int userChoise3 = userInput.nextInt();

                System.out.println("Je hebt de volgende getallen ingevoerd:");
                System.out.println("Getal 1: " + userChoise1);
                System.out.println("Getal 2: " + userChoise2);
                System.out.println("Getal 3: " + userChoise3);

                int userChoiseSumOfDigits = userChoise1 + userChoise2 + userChoise3;
                int userChoiseProductOfDigits = userChoise1 * userChoise2 * userChoise3;

                // Stap 4 Winconditie toevoegen
                hasPlayerWon = userChoiseSumOfDigits == sumOfDigits && userChoiseProductOfDigits == productOfDigits;

                if (hasPlayerWon) {
                    System.out.println("Gefeliciteerd, je hebt gewonnen");
                } else {
                    System.out.println("Helaas, je hebt verloren");
                }
            }

            // Stap 6 Menu toevoegen
            boolean continuePlaying = true;

            System.out.println("Wil je het spel nogmaals spelen. Toets y/n");

            String continuePlayingUserChoise = userInput.next();

            switch (continuePlayingUserChoise) {
                case "y": {
                    System.out.println("Je hebt ervoor gekozen nogmaals te spelen");
                    continuePlaying = true;
                    break;
                }
                case "n": {
                    System.out.println("Je hebt ervoor gekozen te stoppen");
                    continuePlaying = false;
                    break;
                }
                default: {
                    System.out.println("Je hebt geen geldige waarde ingevoerd");
                    break;
                }
            }
            if (continuePlaying == false) {
                break;
            }
        }
        System.out.println("Het spel is afgelopen");
    }
}




