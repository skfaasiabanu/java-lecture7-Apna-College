import java.util.*;
public class sumd{
    public static void add(int n)
    {    int sum=0;
    while(n>0)
    {
        int last=n%10;
        sum=sum+last;
        n=n/10;
    }
    System.out.println("the sum of digits is"+sum);

       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ");
        int a=sc.nextInt();
        add(a);

    }
}