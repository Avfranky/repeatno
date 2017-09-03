package guvi;
import java.util.Scanner;
class subsetele {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] s1=s.split(" ");
        s=sc.nextLine();
        String[] s2=s.split(" ");
        System.out.print((s1.length>s2.length)?(subs(s1,s2)):(subs(s2,s1)));
    }
    public static String subs(String[]a,String[]b)
    {
        String result="";
        int count=0;
        for(int i=0;i<b.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                if(a[j].equals(b[i]))
                {
                    count++;
                }
            }
        }
        if(count==b.length)
        {
            result="YES";
        }
        else
        {
            result="NO";
        }
      return result;  
    }
}
