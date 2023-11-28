import java.util.Arrays;

public class SelectedSort {
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,2,3};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] target){
        for (int i = 0; i < target.length - 1; i++) {
            int left = target[i];
            for (int j = i+1 ; j < target.length; j++) {
                int right = target[j];
                if (left > right){
                    target[i]= right;
                    target[j]= left;
                    left=right;
                }

            }

        }
    }

}
