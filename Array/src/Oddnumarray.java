public class Oddnumarray {
    public static void main(String []args){

        int arr[]= new int[]{32,20,11,40,14,21,7};

        System.out.println("Before the array");
        for(int i=0;i< arr.length;i++){
            System.out.print(" "+ arr[i]);
        }
        System.out.println();

        for(int i=0;i< arr.length;i++){
            if(arr[i]%2!=0){

                System.out.print(" "+arr[i]);
            }
        }
    }
}
