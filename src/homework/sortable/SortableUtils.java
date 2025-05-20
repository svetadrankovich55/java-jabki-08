package homework.sortable;

public class SortableUtils {
    public static void sort(Sortable[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compare(array[j + 1]) > 0) {
                    Sortable temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}