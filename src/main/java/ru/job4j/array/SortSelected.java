package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {

            int minSort = MinDiapason.findMin(data, i, (data.length - 1));
            int indexSort = FindLoop.indexInRange(data, minSort, i, data.length - 1);
            data = SwitchArray.swap(data, i, indexSort);
        }
        return data;
    }
}
