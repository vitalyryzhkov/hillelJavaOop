package task19;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.copyOf;

public class Container {
    private int arrayLength = 10;
    private int[] arr = new int[arrayLength];
    private int currentIdx = 0;


    //    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number of entered numbers: ");
//        int countElements = scanner.nextInt();
//
//        for (int i = 0; i < countElements; i++) {
//            System.out.println("Enter the num");
//            arr[i] = addArr(scanner.nextInt());
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println("Digit under the index: " + getValueAtIdx(1));
//        System.out.println("Contains " + contains(5));
//        clear();
//        System.out.println(Arrays.toString(arr));
//        System.out.println(getIdx(1));
//        System.out.println(getSize(arr));
//        System.out.println(Arrays.toString(sort(arr)));


//    }


    int[] getArr() {
        return arr;
    }

    int addArr(int val) {
        arr[currentIdx] = val;
        currentIdx++;
        if (currentIdx > arrayLength) {
            limitIndex(arr);
        }
        return val;
    }

    private void limitIndex(int[] array) {
        int newLength = arrayLength * 2;
        int[] arr2 = new int[newLength];
        System.arraycopy(array, 0, arr2, 0, arrayLength);
        arrayLength = newLength;
        arr = arr2;
    }

    private int getValueAtIdx(int index) {
        return arr[index];
    }

    private boolean contains(int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return true;
            }
        }
        return false;
    }

    private void clear() {
        arr = new int[arrayLength];
    }

    private int getIdx(int elem) {
        for (int i = 0; i < arr.length; i++) {
            if (elem == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    private int getSize(int[] arr) {
        return arr.length;
    }

    private int[] sort(int[] arr) {
        if (arr.length < 1000) {
            mySort(arr);
        } else {
            int first = 0;
            int last = arr.length - 1;
            quickSort(first, last);
        }
        return arr;

    }

    private void mySort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    private void quickSort(int first, int last) {
        int l = first;
        int r = last;
        int m = arr[(first + last) / 2];

        do {
            while (arr[l] < m) {
                l++;
            }

            while (arr[r] > m) {
                r--;
            }

            if (l <= r) {
                swap(l, r);
                l++;
                r--;
            }
        } while (l < r);

        if (l < last) {
            quickSort(l, last);
        }

        if (r > first) {
            quickSort(first, r);
        }
    }

    private void swap(int l, int r) {
        int tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
    }

    void addAll(int[] arrayFrom, int[] arrayTo) {
        for (int i = 0; i < arrayFrom.length; i++) {
            if (arrayFrom.length <= arrayTo.length) {
                arrayTo[i] = arrayFrom[i];
            } else {
                System.out.println("Arrays not the same length");
                break;
            }
        }
        System.out.println(Arrays.toString(arrayTo));
    }

    boolean isEquals(Container container) {
        if (arr.length == container.getArr().length) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != container.getArr()[i]) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
