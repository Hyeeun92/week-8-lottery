package com.company;



import java.util.Random;

public class Lottery extends Panel {

    Random R = new Random();
    private int[] lotto = new int[6];
    int check[] = new int[50];

    public Lottery(int quantity) {
        setQuantity(quantity);

        for (int i = 0; i < quantity; i++)
            for (int j = 0; j < 6; j++) {
                lotto[j] = R.nextInt(50) + 1;

                if (check[lotto[j]] == 0) {
                    check[lotto[j]] = 1;
                } else
                    i--;
            }


        System.out.println(lotto);
    }

}






