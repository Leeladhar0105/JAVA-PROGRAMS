import java.util.*;
public class PrintSubsequenceWithGivenSum {

    static void printSequenceSum(int start,int end,int[] arr,ArrayList<Integer> arlist,int sum,int target){
        if(start>=end){
            if(sum==target){
                System.out.println(arlist);
                
            }
            return;

        }

        arlist.add(arr[start]);
        sum+=arr[start];
        printSequenceSum(start+1, end, arr, arlist,sum,target);
        Integer num=arr[start];
        arlist.remove(num);
        sum-=arr[start];
        printSequenceSum(start+1, end, arr,arlist, sum, target);


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        ArrayList<Integer> arlist=new ArrayList<>();
        System.out.println("enter numbers:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter target sum:");
        int target=sc.nextInt();
        printSequenceSum(0,n,arr,arlist,0,target);

    }
    
}
