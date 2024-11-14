public class bitodec
{

    public static void binToDec(int n)
    {
        int pow=0;
        int decnum=0;
        while(n>0)
        {
             int last=n%10;
            decnum=decnum+(last*(int)Math.pow(2,pow));

            pow++;
            n=n/10;
        }
        System.out.println("decimal value is"+decnum);
    }
    public static void main(String args[])
    {
        binToDec(101);
    }
}