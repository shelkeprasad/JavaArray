public class Ascending {

    public static void main(String [] args) {

        int arr[] = new int[]{20, 10, 12, 32, 11, 5};

        int temp = 0;
        System.out.println("elements of array");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if(arr[i]> arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        System.out.println();

        System.out.println(" after sorting this array");

        for(int i=0;i< arr.length;i++){

            System.out.print(arr[i]+" ");
        }



    }
}

