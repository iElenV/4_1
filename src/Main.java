import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr [] = new int [15];
        arr [0] = 0;
        arr [1] = 1;
        System.out.print (arr [0]+ " ");

        for (int i = 2; i < 15; i++) {
            arr [i] = arr [i-1]+arr [i-2];
            if (arr[i]%2==0) {
                System.out.print (arr [i] + " ");
            }

        }
        //System.out.println("\n" + Arrays.toString(arr));
    }
}