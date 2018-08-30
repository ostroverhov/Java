import java.util.Arrays;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, -4, 89, 65, 4, 13};
        int lenght = arr.length;
        int min = arr[0];
        for (int i = 0; i < lenght; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min);

        int max = arr[lenght - 1];
        for (int i = lenght - 1; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max = " + max);

        for (int i = 0; i < lenght - 1; i++) {
            if (arr[i] == min) {
                arr[i]  = 0;
            }
            if (arr[i] == max) {
                arr[i] = 99;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
