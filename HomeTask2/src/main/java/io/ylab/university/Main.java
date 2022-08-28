package io.ylab.university;

public class Main {
    public static void main(String[] args) {

        int [] array = {5,6,3,2,5,1,4,9};
        System.out.println("Неотсортированный массив:");
        System.out.println("_____________________________");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
             }

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j =i+1; j < array.length ; j++) {
                if (array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                   }
           }
        }

        System.out.println();
        System.out.println("Отсортированный массив:");
        System.out.println("_____________________________");
        for (int i = 0; i < array.length ; i++) {
            System.out.print(array[i]+" ");
        }

        assert isSorted(array): "Массив отсортирован неправильно";

    }
    private static boolean isSorted (int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            if (array[i]>array[i+1])
                return false;
             }
        return true;

    }

}