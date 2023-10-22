package by.bsuir.webtech1.task7;

public class ArraySorting {
    public static int[] sort(int[] array) {
        for (int i = 0;i < array.length - 1; i++) {
            if(array[i] > array[i + 1]) {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if(i!=0) {
                    i -= 2;
                }
            }
        }
        return array;
    }
}
