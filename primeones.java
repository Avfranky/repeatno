package guvi;
import java.util.Scanner;
public class primeones {
    public static void main(String[]args)
    {
    Scanner sc=new Scanner(System.in);
    String s1=sc.nextLine();
    String[] s=s1.split(" ");
    int count=0,i;    
    for(i=Integer.parseInt(s[0]);i<=Integer.parseInt(s[1]);i++)
    {
        int b;
        boolean c;
        b=countones(i);
        c=prime(b);
        if(c)
        {
            count++;
        }
    }
    System.out.print(count);
    }
    public static int countones(int a)
    {
        int count=0;
        while(!(a/2==0))
        {
            if(a%2==1)
            {
                count++;
            }
            a/=2;
        }
        count++;       
        return count;
    }
    public static boolean prime(int b)
    {
        int count=0;
        for(int i=2;(i<=b/2)||(b==1);i++)
        {
            if((b%i==0))
            {
                count=1;
            }
            if(b==1)
            {
                count=1;
                break;
            }
        }
        if(count==0)
        {
            return true;
        }
        return false;
    }
}
