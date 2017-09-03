package guvi;

import java.util.Scanner;

public class order {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        String temp;
        for(int i=0;i<s1.length;i++)
        {
            for(int j=i+1;j<s1.length;j++)
            {
                if(Integer.parseInt(s1[i]+s1[j])<Integer.parseInt(s1[j]+s1[i]))
                {
                    temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                }
            }
            System.out.print(s1[i]);
        }        
    }
}
