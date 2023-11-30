package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] guestList = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Controlliamo se sei sulla lista. Dimmi il tuo nome");
        String guestInput = scan.nextLine();

        boolean match = false;
      /*  for (int i = 0; i < guestList.length && !match; i++) {
            if (guestList[i].equals(guestInput)){
                match = true;
            }
        }*/
        int i = 0;
        while (i < guestList.length){
            if (guestList[i].equals(guestInput)){
                match = true;
            }
            i++;
        }
        if (match){
            System.out.println("Il tuo nome è nella lista. Buon divertimento!");
        } else {
            System.out.println("Che ci fai qui? Il tuo nome non è nella lista, vattene!");
        }


    scan.close();
    }
}
