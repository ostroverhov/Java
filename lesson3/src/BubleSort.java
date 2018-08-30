import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {9,10,12,1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int change = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = change;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
