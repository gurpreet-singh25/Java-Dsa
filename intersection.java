import java.util.Arrays;

public class intersection {
    static void printIntersection(int arr1[], int arr2[], int m , int n ){
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j = 0;
        while(i< m && j< n){
            if(arr1[i] < arr2[j]){
                i+=1;

            }else if(arr2[j] < arr1[i]){
                j+=1;

            }else{
                System.out.println(arr2[j]);
                j+=1;
                i+=1;
            }
        }
    }
    public static void main(String[] args) {
    int arr1[]= {7, 1, 5, 2, 3, 6};
    int[] arr2 = {3, 8, 6, 20, 7};
    int m =arr1.length;
    int n = arr2.length;
    printIntersection(arr1,arr2, m , n);
}
}

