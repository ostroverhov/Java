import java.util.Arrays;

public class IncreaseSequence {
    public static void main(String[] args) {
        int number = 123654;
        int lenght = String.valueOf(number).length();
        int[] arr = new int[lenght];
        for (int i = lenght - 1; i >= 0; i--) {
            arr[i] = number % 10;
            number /= 10;
        }
        System.out.println(Arrays.toString(arr));
        boolean increase = true;
        for (int i=0; i<lenght; i++)
            if (arr[i]+1 != arr[i+1]){
                increase = false;
                break;
            }
        System.out.println(increase? "возрастает" : "не возрастает");
    }
}
