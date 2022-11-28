package HomeWork;

import java.util.Arrays;

public class HWarray {
    public static void main(String[] args) {
        int[] box = new int[100];
        box[0] = 0;
        box[98] = 0;

        for (int i = 1; i < box.length; i++) {
            if (i == 98) {
                continue;
            }
            box[i] = 10;
        }
        System.out.println(Arrays.toString(box));


        int[] array = new int[100];
        array [0] = 111;
        for (int d = 1; d < array.length ; d++) {
            array[d] = array[d -1] + 111;
            if (d % 10 == 0){
            array[d] = 111;}
        }
        System.out.println(Arrays.toString(array));

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i] ;
        }
        System.out.println(sum);

    }
}
