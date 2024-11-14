import java.util.*;
public class rangeprime
{
    public static boolean prim(int b)
    {
        if(b==2)
        {
            return true;
        }
        for(int i=2;i<b;i++)
        {
            if(b%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void primerange(int n)
    {
        for(int i=2;i<=n+1;i++)
        {
            if(prim(i))
            {
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        primerange(a);
    }
}


    