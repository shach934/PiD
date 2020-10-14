package pid.exercise.sort;

public class SelectionSort {
    public static void swap(int[] array, int a, int b){
        int dummy = array[a];
        array[a] = array[b];
        array[b] = dummy;
    }

    public static void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i ++){
            int min = array[i];
            int minIndex = i;
            for(int j = i + 1; j < array.length; j ++) {
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);
        }
    }

}
