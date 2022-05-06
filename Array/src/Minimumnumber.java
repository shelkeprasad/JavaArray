public class Minimumnumber {
    public static void main(String[] args){

        int arr[]= new int[]{32,32,88,66,11,999};
        int min=arr[0];

        System.out.println("Before the array");

        for(int i=0;i<arr.length;i++){

            System.out.print(" "+ arr[i]);
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){

                min=arr[i];
            }
        }

        System.out.println("minimum number="+ min);


    }
}
