public class dectobi
{
    public static void decToBi(int n){
        
        
        int bin=0;
        int pow=0;
        while(n>0)
        {
            
           int rem=n%2;
            bin=bin+rem*(int)Math.pow(10,pow);
            pow++;
            n=n/2;

        }
        System.out.println("the binary value is"+bin);
    }
    public static void main(String args[])
    {
        decToBi(8);
    }
}