public class PrintMaxSubarraysum {
    public static void main(String[] args) {

        int[] arr=new int[]{-2,-3,4,-1,-2,1,5,-3};
        int n=arr.length;
        int sum=0;
        int ansstart=-1,ansend=-1,start=-1;
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(sum==0)
            start=i;
            sum=sum+arr[i];
            if(sum>maxi)
            {
                maxi=sum;
                ansstart=start;
                ansend=i;
            }

            if(sum<0)
            {
                sum=0;
                
            }

        }
        if(maxi<0)
        {
            System.out.println("no subarray greater than 0");
        }
        else
        {
            for(int i=ansstart;i<=ansend;i++)
            {
                System.out.print(arr[i]+" ");
            }

        }
        
    }
    
}
