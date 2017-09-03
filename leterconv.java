package guvi;
import java.util.Scanner;
public class leterconv {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String[] s=s1.split("");
        int count=0;
        for(int i=0;i<s.length-1;i++)
        {
            if(Integer.parseInt(s[i]+s[i+1])<27)
            {
                count++;
            }
        }
        int a=2,b=3,sum=0;
        if(count==1)
        {
            sum=2;            
        }
        else if(count==2)
                {
                    sum=3;
                }
        else{
        for(int i=3;i<=count;i++)
        {
            sum=a+b;
            a=b;
            b=sum;
        }
        }
        System.out.print(sum);
    }
}
