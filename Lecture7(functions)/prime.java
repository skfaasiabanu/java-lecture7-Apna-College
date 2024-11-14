import java.util.*;
public class prime
{
    public static boolean prim(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=1;i<=Math.sqrt(n);i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean result=prim(a);
        if(result)
        {
           
            System.out.println("prime");
        }
        else
        {
         
            System.out.println("not prime");
        }
    }
}


    