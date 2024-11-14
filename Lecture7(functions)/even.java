import java.util.*;
public class even{
    public static boolean iseven(int num1)
    {    
        if(num1%2==0)
    {
        return true;
    }
    else
    {
        return false;
    }
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a ");
        int a=sc.nextInt();
        if(iseven(a)==true){
        System.out.println("the number is even");
        }
        else{
           System.out.println("the number is odd"); 
        }

    }
}