package pid.exercise.sort;

public class BubbleSort {

    public static void swap(int[] array, int a, int b){
        int dummy = array[a];
        array[a] = array[b];
        array[b] = dummy;
    }                             
    public static void sort(int[] array) {
        if(array.length <= 1){
            return;
        }
        while (true) {
            boolean sorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1] > array[i]) {
                    swap(array, i-1, i);
                    sorted = false;
                }
            }
            if(sorted)
                break;
        }
    }

}
