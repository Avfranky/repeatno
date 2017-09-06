package guvi;
import java.util.Scanner;
public class sumset {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer[] a=new Integer[n];
        int i,j,b=0,c=0,sum;
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int value=a[0];
        for(i=0;i<n;i++)
        {
            sum=0;
            for(j=i;j<n;j++)
            {
                sum+=a[j];
                if(value<sum)
                {
                    value=sum;
                    b=i;
                    c=j;
                }
            }
        }
        System.out.println(b+" "+c);
    }
}