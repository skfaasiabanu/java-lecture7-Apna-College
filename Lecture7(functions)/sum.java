import java.util.*;
public class sum{
    public static int add(int num1,int num2)
    {    int sum=num1+num2;
        return sum;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ");
        int a=sc.nextInt();
        System.out.println("enter b ");
        int b=sc.nextInt();
        System.out.println("sum="+add(a,b));

    }
}