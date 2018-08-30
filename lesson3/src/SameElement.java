public class SameElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,6,7,7,7,8,9};
        boolean[] checked = new boolean[arr.length-1];
        int count = 1;
        for (int i = 0; i<arr.length; i++) {
            for (int j = i + 1; j<arr.length; j++) {
                if (arr[i] == arr[j] && checked[j] == false){
                    count++;
                    checked[j] = true;
                }
            }
            if (count > 1) {
                System.out.println(arr[i] + "repeat" + count);
                count = 1;
            }
        }
    }
}
