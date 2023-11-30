import java.util.Arrays;

public class SortingTypes {
    public static void main(String[] args) {

        int[] array = {10, 2, 10, 3, 1, 5};
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length; i++) {
            if(array[i] < array[i-1]){
                swap(array, i, i-1);
            }
            System.out.println(Arrays.toString(array));
        }
    }
    private static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
