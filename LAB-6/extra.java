import java.util.Arrays;

public class extra {
    public static void main(String[] args) {

        int arr[] = { 1, 3, 4, 2, 5 };
        A a = new A(arr);
        System.out.println(Arrays.toString(a.sortArr(arr)));

    }
}

class A {

    int[] arr;

    A(int[] arr) {

    }

    int[] sortArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i-1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
}
