import java.util.*;
public class overloading{
    public static int add(int num1,int num2)
    {    
        return num1+num2;
       
    }
    public static int add(int num1,int num2,int num3)
    {    
        return num1+num2+num3;
       
    }
    public static float add(float num1,float num2)
    {    
        return num1+num2;
       
    }
    public static double add(double num1,double num2,double num3)
    {    
        return num1+num2+num3;
       
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("sum="+add(3,2));
        System.out.println("sum="+add(3,2,5));
         System.out.println("sum="+add(3.2f,2.6f));
         System.out.println("sum="+add(3.789,2.098,5.1234));

    }
}