import java.util.Scanner;

public class maxMin {
    public static void main(String[] args){
        int arr [];
        int n ;
        int min ;
        int max;

        System.out.println("Enter the size of an array");
        Scanner sc = new Scanner(System.in);
        n = sc .nextInt();
        arr = new int[n];
        for(int i = 0; i<n;i++){
            System.out.println("Enter the "+i+"th element:");
            int x = sc.nextInt();
            arr[i] = x;}
       

        if(n==1){
            min=arr[0];max = arr[0];

        }
        if(arr[0] >arr[1]){
            min = arr[1];
            max = arr[0];
        }
        else{
            min = arr[0];max =arr[1];

        }
        for(int i = 2;i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The maximum elemnt is "+ max );
        System.out.println("The minimum elemnt is "+ min );

    }}

        
        

    