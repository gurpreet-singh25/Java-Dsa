import java.util.HashSet;

public class union {
    static  void getUnion(int a[], int n, int b[], int m){
        HashSet<Integer> s = new HashSet<>();
        for(int i =0; i <n; i++){
            s.add(a[i]);
        }
        for(int i = 0 ; i <m ; i++){
            s.add(b[i]);
        }

        System.out.print(
            "Number of elements after union operation: "+ s.size()+ "\n"
        );
        System.out.println("The union set of both arrays is: ");
        System.out.println(s.toString()+" ");
    }
    public static void main(String[] args) {
        int a[] = {3,25,6,7,4,1,67,4,2};
        int b[] = {86,43,2,6,33,4,90};
        getUnion(a, 8, b, 7);
    }
}
