public class Maximumnumber {
    public static void main(String[] args){

        int arr[]= new int []{33,44,66,55,11,32};

        int max=arr[0];
        System.out.println("Before the array");

        for(int i=0;i< arr.length;i++){

            System.out.print(" "+arr[i]);
        }
        System.out.println();

        for(int i=0;i< arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }
        }
        System.out.println("maximum number are= "+ max);
    }
}
