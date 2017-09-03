package guvi;
import java.util.ArrayList;
import java.util.Scanner;
public class closetozero {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String[] s=a.split(" ");int i,j,n=0,m=1;
        int sum=Integer.parseInt(s[0])+Integer.parseInt(s[1]);
        for(i=0;i<s.length-1;i++)
        {
            for(j=i+1;j<s.length;j++)
            {
                if(j==1)
                {
                    j++;
                }
               if(sum>Integer.parseInt(s[i])+Integer.parseInt(s[j]))
               {
                   sum=Integer.parseInt(s[i])+Integer.parseInt(s[j]);
                   n=i;
                   m=j;
               }
            }
        }
        System.out.print(s[n]+" "+s[m]);        
    }
}
