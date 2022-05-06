import java.util.SortedMap;

public class Decendingarray {

    public static void main(String[] args) {


        int arr[] = new int[]{32, 33, 54, 66, 33, 22};

        int temp = 0;

        System.out.println("Before sorting array");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("After the sorting this array");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }
    }
}
