import java.util.*;
public class binomial{
    public static int fact(int n)
    {    int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;

        }
        return f;
       
    }
    public static void bino(int n,int r)
    {
        int n_fact=fact(n);
        int r_fact=fact(r);
        int a_fact=fact(n-r);
        int bio=(n_fact)/((r_fact)*(a_fact));
        System.out.println("binomial coefficient ="+bio);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        System.out.println("enter r ");
        int r=sc.nextInt();
        bino(n,r);

    }
}