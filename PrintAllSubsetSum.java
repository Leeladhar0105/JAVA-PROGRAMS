import java.util.*;
public class PrintAllSubsetSum {

    static void printAll(int[] arr,int n,ArrayList<Integer> lis,int ind,int sum)
    {
        if(ind==n)
        {
            lis.add(sum);
            return;
        }
        

        printAll(arr,n,lis,ind+1,sum+arr[ind]);
        printAll(arr,n,lis,ind+1,sum);

       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        ArrayList<Integer> lis=new ArrayList<>();
        printAll(arr,n,lis,0,0);
        Collections.sort(lis);
        System.out.println(lis);
        
    }
    
}
