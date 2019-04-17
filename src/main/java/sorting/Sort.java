package sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Sort {
    public static void main(String[] args) {
        List<Integer> list = Stream.of(6, 20, 8, 19, 56, 23, 87, 41, 49, 53).collect(toList());
        System.out.println(list);
        System.out.println(quickSort(list));
    }

    private static List<Integer> bubbleSort(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            boolean isSwapped = false;
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    Integer temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return list;
    }

    private static List<Integer> mergeSort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }
        int mid = list.size() / 2;
        List<Integer> left = mergeSort(list.subList(0, mid));
        List<Integer> right = mergeSort(list.subList(mid, list.size()));

        int l = 0;
        int r = 0;
        int res = 0;
        List<Integer> result = new ArrayList<>(left.size() + right.size());

        while (l < left.size() && r < right.size()) {
            if (right.get(r) < left.get(l)) {
                result.add(right.get(r++));
            } else {
                result.add(left.get(l++));
            }
            res++;
        }
        while (l < left.size()) {
            result.add(left.get(l++));
            res++;
        }
        while (r < right.size()) {
            result.add(right.get(r++));
            res++;
        }
        return result;
    }

    private static List<Integer> quickSort(List<Integer> list) {
        return quickSort(list, 0, list.size() - 1);
    }

    private static List<Integer> quickSort(List<Integer> list, int startIdx, int endIdx) {
        if (endIdx > startIdx) {
            int pivotIdx = partition(list, startIdx, endIdx);
            quickSort(list, startIdx, pivotIdx);
            quickSort(list, pivotIdx + 1, endIdx);
        }
        return list;
    }

    private static int partition(List<Integer> list, int lowIdx, int highIdx) {
        int pivotValue = list.get(lowIdx);
        while (true) {
            while (list.get(lowIdx) < pivotValue) {
                lowIdx++;
            }
            while (list.get(highIdx) > pivotValue) {
                highIdx--;
            }
            if (lowIdx >= highIdx) {
                return highIdx;
            }
            Integer temp = list.get(lowIdx);
            list.set(lowIdx, list.get(highIdx));
            list.set(highIdx, temp);
            lowIdx++;
            highIdx--;
        }
    }
}
