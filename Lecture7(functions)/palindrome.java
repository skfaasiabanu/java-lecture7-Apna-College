import java.util.*;
public class palindrome{
    public static void  palin(int num1)
    {    
        int num=num1;
          int reverse=0;
          
         while(num!=0)
         {
            int rem=num%10;
            reverse=reverse*10+rem;
            num=num/10;
         }
         if(reverse==num1)
         {
            System.out.println("palindrome");
         }
         else{
            System.out.println("not palindrome");
         }
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n ");
        int n=sc.nextInt();
        palin(n);
        

    }
}