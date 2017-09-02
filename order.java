package guvi;

import java.util.Scanner;

public class order {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        int a,b;
        String temp;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=i+1;j<s1.length;j++)
            {
                a=first(Integer.parseInt(s1[i]));
                b=first(Integer.parseInt(s1[j]));
                if(a<b)
                {
                    temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
                if(a==b)
                {
                    if(Integer.parseInt(s1[i])<Integer.parseInt(s1[j]))
                    {
                        temp=s1[i];
                        s1[i]=s1[j];
                        s1[j]=temp;
                    }
                }
            }
            System.out.print(s1[i]);
        }        
    }
    public static int first(int a)
    {
        while(a/10!=0)
        {
            a/=10;
        }
        return a;
    }
}
