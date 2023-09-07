import java.lang.reflect.Array;

public class dutchNationalFlag {
    static void sort012(int a[] , int n){
        int l =0 ;
        int hi = n-1;
        int mid = 0 , temp =0;

        while(mid<= hi){
            switch (a[mid]) {
                case 0:{
                    temp = a[l];
                    a[l]=a[mid];
                    a[mid] = temp;
                    l++;mid++;
                    break;
                }
                case 1:
                    mid ++;
                    break;
                    
                case 2:{
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
                
            }
        }
    }

    static void printArray(int arr[], int n){
        int i;
        for(i = 0;i<n;i++){
            System.out.print(arr[i] +" ");}
        System.out.println("");
        
    }
    public static void main(String[] args) {
        int arr[] = { 0,0,2,1,0,1,1,2,0};
        int n = arr.length;
        sort012(arr, n);
        printArray(arr, n);
    }
}
