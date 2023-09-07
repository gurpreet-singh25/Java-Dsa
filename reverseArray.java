import java.util.Scanner;

public class reverseArray {


    static void printArray(int arr[] , int n){
        for(int i =0; i <n ;i++ ){
            System.out.print(arr[i]+ " ");
        }
    }
    static void arrayReverse(int arr[], int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] ;
        int n ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        arr = new int [n];
               if(n>0){
                
                for(int i =0;i<n;i++){
                    System.out.println("Enter the "+ i +"th element. ");
                    int x = sc.nextInt();
                    arr[i] = x;
                }

                printArray(arr,n);
                System.out.println("**********");

                }
                else{
                    System.out.println(" Enter the valid size ");
                }
                arrayReverse(arr ,0 , n-1 );
                printArray(arr,n);


    }
    
    
    
}
