public class Evennumarray {
    public static void main(String[]args){

        int arr[]= new int[]{11,40,13,17,50,60,18,20};

        System.out.println("Before array list");

        for(int i=0;i< arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();

        System.out.println("Even number is");

        for(int i=0;i< arr.length;i++){

            if(arr[i]%2==0){

                System.out.print(" "+ arr[i]);
            }
        }
    }
}
