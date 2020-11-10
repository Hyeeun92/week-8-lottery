package com.company;



import java.util.Random;

public class Lottery extends Panel {

    public Lottery(int quantity) {

        setQuantity(quantity);
       int[] iArray = new int[6];


       for (int a = 0; a < quantity; a++) {
           for (int i = 0; i < iArray.length; i++) {
               iArray[i] = (int) (Math.random() * 50);
               for (int j = 0; j < i; j++) {
                   if (iArray[i] == iArray[j] || iArray[i]==0) {
                       i--;
                   }
               }
           }

           for (int i = 0; i < iArray.length; i++) {
               System.out.print(iArray[i] + " ");
           }
           System.out.println("");
       }
    }
}
