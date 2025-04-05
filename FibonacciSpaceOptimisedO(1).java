public class Main{
    
    static int fib(int n)
    {
        int prev2=0;
        int prev=1;
        int curri;
        for(int i=2;i<=n;i++)
        {
            curri=prev2+prev;
            prev2=prev;
            prev=curri;
        }
        return prev;
    }
    
    public static void main(String[] args)
    {
        int n=5;
       
        System.out.println(fib(n));
        
    }
    
}