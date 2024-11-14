import java.util.*;
public class swap{
    public static void swap(int num1,int num2)
    {    int temp=num1;
          num1=num2;
          num2=temp;
        System.out.println("after swapping"+num1+" "+num2);
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ");
        int a=sc.nextInt();
        System.out.println("enter b ");
        int b=sc.nextInt();
        System.out.println("before swapping"+a+" "+b);
       swap(a,b);

    }
}