import java.util.*;
public class product{
    public static int multiply(int num1,int num2)
    {    int mul=num1*num2;
        return mul;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ");
        int a=sc.nextInt();
        System.out.println("enter b ");
        int b=sc.nextInt();
        System.out.println("product="+multiply(a,b));

    }
}