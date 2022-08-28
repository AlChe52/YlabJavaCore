package io.ylab.university;

public class Main {
    public static int a = (int) (System.currentTimeMillis()+1);
    public static int c = (int) (System.currentTimeMillis()+21);
    public static int m = (int) (System.currentTimeMillis()+67);
    public static int seed =(int) (System.currentTimeMillis()+5);
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";

    public static void main(String[] args) {

        int [][] array = new int[5][5];

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
               array[i][j] = getRandomNumber();
                   }
        }

        int minNumber=array[0][0];
        int maxNumber=0;
        int sumAllElemOfArray=0;

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (array[i][j] <minNumber) {
                    minNumber=array[i][j]; }
                if (array[i][j]>maxNumber) {
                    maxNumber=array[i][j];
                                           }
                sumAllElemOfArray=sumAllElemOfArray+array[i][j];
               }
         }

        System.out.println("Массив:");
        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <5 ; j++) {
                if (array[i][j] ==minNumber) {
                    System.out.print(GREEN+array[i][j]+" "+RESET);
               }
                else
                if (array[i][j]==maxNumber) {
                    System.out.print(RED+array[i][j]+" " +RESET);
                }
                else{
                System.out.print(array[i][j]+" ");}
            }

            System.out.println();
        }
        System.out.println("_________________________________");

        System.out.println("Минимальный элемент массива: "+minNumber);

        System.out.println("Максимальный элемент массива: "+maxNumber);

       double midArithm =  ((double)sumAllElemOfArray/25);
       if (midArithm<0)
           midArithm=midArithm*-1;

        System.out.println("Среденее арифметическое элементов массива: "+midArithm);
    }
                public static int getRandomNumber() {
                    seed = (a * seed + c) % m;
                   return seed;
                }
    }