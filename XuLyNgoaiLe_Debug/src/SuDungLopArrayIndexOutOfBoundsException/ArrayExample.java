package SuDungLopArrayIndexOutOfBoundsException;

import java.util.Random;

public class ArrayExample {
    public Integer[] creatRandom(){
        Random random = new Random();
        Integer[] array = new Integer[100];
        System.out.println("List of array: ");
        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        return array;
    }

}
