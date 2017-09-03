
package guvi;

import java.util.Scanner;

public class index {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String[] s=s1.split(" ");
        for(int i=0;i<s.length;i++)
        {
            if(Integer.parseInt(s[i])==i)
            {
                System.out.print(i);
                break;
            }
        }
    }
}
