import java.util.*;

public class PrintSubsequenceRecursion {

    static void printSequence(int start,int end,int[] arr,ArrayList<Integer> arlist){

        if(start>=end){
            System.out.println(arlist);
            return;
        }

        arlist.add(arr[start]);
        printSequence(start+1, end, arr, arlist);
        Integer in=arr[start];
        arlist.remove(in);
        printSequence(start+1, end, arr, arlist);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> arlist=new ArrayList<>();

        System.out.println("Enter numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        printSequence(0,n,arr,arlist);


    }
    
}
